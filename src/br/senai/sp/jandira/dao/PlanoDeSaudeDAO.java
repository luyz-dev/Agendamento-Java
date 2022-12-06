package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

//    private final static String URL = "C:\\Users\\22282203\\JAVA\\Planos.txt";
    private final static String URL = "F:\\JAVA\\Planos.txt";
//    private final static String URL_TEMP = "C:\\Users\\22282203\\JAVA\\Planos-temp.txt";
    private final static String URL_TEMP = "F:\\JAVA\\Planos-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    public static void gravar(PlanoDeSaude ps) {
        planos.add(ps);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(ps.getPlanoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro plano de saude!!");
        }

    }

    public static ArrayList<PlanoDeSaude> getPlanos() {
        return planos;
    }

    public static PlanoDeSaude getPlano(Integer codigo) {
        for (PlanoDeSaude ps : planos) {
            if (codigo.equals(ps.getCodigo())) {
                return ps;
            }
        }

        return null;
    }

    public static void excluir(Integer codigo) {
        for (PlanoDeSaude ps : planos) {
            if (codigo.equals(ps.getCodigo())) {
                planos.remove(ps);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void atualizar(PlanoDeSaude planosAtualizada) {
        for (PlanoDeSaude ps : planos) {
            if (planosAtualizada.getCodigo().equals(ps.getCodigo())) {
                int posicao = planos.indexOf(ps);
                planos.set(posicao, planosAtualizada);
            }
        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {
        // Passo 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            // Criar arquivo temporario
            arquivoTemp.createNewFile();

            // Abrir o arquivo temporário
            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as especialidades
            // no arquivo temporário,exceto o registro que 
            // não queremos mais
            for (PlanoDeSaude ps : planos) {
                bwTemp.write(ps.getPlanoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            arquivoAtual.delete();
            
            // Renomear arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);
            

        } catch (Exception error) {
            error.printStackTrace();
        }

    }

    public static void criarListaDePlanos() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                String[] vetor = linha.split(";");
                PlanoDeSaude ps = new PlanoDeSaude(vetor[1], vetor[2], vetor[3], LocalDate.parse(vetor[4]), Integer.valueOf(vetor[0]));
                planos.add(ps);
                linha = leitor.readLine();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro lista de plano de saude!!");
        }

    }

    public static DefaultTableModel getPlanosModel() {

        String[] titulos = {
            "CODIGO",
            "OPERADORA",
            "NUMERO",
            "CATEGORIA",
            "VALIDADE",};

        String[][] dados = new String[planos.size()][5];

        int i = 0;
        for (PlanoDeSaude ps : planos) {
            dados[i][0] = ps.getCodigo().toString();
            dados[i][1] = ps.getOperadora();
            dados[i][2] = ps.getNumero();
            dados[i][3] = ps.getCategoria();

            DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = ps.getValidade().format(formatacao);

            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);

        return model;
    }

}
