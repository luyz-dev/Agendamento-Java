package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

//    private final static String URL = "C:\\Users\\22282203\\JAVA\\Medicos.txt";
    private final static String URL = "F:\\JAVA\\Medicos.txt";
    private final static Path PATH = Paths.get(URL);
//    private final static String URL_TEMP = "C:\\Users\\22282203\\JAVA\\Medicos-temp.txt";
    private final static String URL_TEMP = "F:\\JAVA\\Medicos-temp.txt";
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<Medico>();
    private static ArrayList<Especialidade> especialidades = new ArrayList<Especialidade>();

    public static void gravar(Medico m) {
        medicos.add(m);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro medico !!");
        }

    }

    public ArrayList<Medico> getMedico() {
        return medicos;
    }

    public static Medico getMedicos(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medicoAtualizado) {
        for (Medico m : medicos) {
            if (medicoAtualizado.getCodigo().equals(m.getCodigo())) {
                int posicao = medicos.indexOf(m);
                medicos.set(posicao, medicoAtualizado);
            }
        }
        atualizarArquivo();

    }

    public static void atualizarArquivo() {
        // Passo 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception error) {
            error.printStackTrace();
        }

    }
    
    public static void criarListaMedicos(){
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                String[] vetor = linha.split(";");
                Medico m = new Medico(vetor[1], vetor[2], vetor[3], LocalDate.parse(vetor[5]), Integer.valueOf(vetor[0]),vetor[4], codigosSeparadosPorPontoEVirgula(linha));
                medicos.add(m);
                linha = leitor.readLine();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro lista de medicos!!");
        }
    }

    public static void excluir(Integer codigo) {
        for (Medico m : medicos) {
            if (codigo.equals(m.getCodigo())) {
                medicos.remove(m);
                break;
            }
        }
        atualizarArquivo();
    }


    public static DefaultTableModel getMedicosModel() {

        String[] titulos = {"CÓDIGO",
            "CRM",
            "Nome",
            "TELEFONE"};

        String[][] dados = new String[medicos.size()][4];

        int i = 0;
        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);

        return model;
    }
    
    public static ArrayList<Especialidade> codigosSeparadosPorPontoEVirgula(String linha) {
        String[] vetor = linha.split(";");

        int vetorDaEspecialidade = 6;

        ArrayList<Especialidade> codigosDaEspecialidade = new ArrayList<>();

        try {
            while (vetor.length > vetorDaEspecialidade) {
                codigosDaEspecialidade.add(EspecialidadeDAO.getEspecialidades(Integer.valueOf(vetor[vetorDaEspecialidade])));
                vetorDaEspecialidade++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return codigosDaEspecialidade;
    }

}
