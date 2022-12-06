package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

//    private final static String URL = "C:\\Users\\22282203\\JAVA\\Especialidade.txt";
    private final static String URL = "F:\\JAVA\\Especialidades.txt";
//    private final static String URL_TEMP = "C:\\Users\\22282203\\JAVA\\Especialidade-temp.txt";
    private final static String URL_TEMP = "F:\\JAVA\\Especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) {
        especialidades.add(e);

        // Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSeparaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro especialidade!!");
        }
    }

    public static ArrayList<Especialidade> getEspecialidade() {
        return especialidades;
    }

    public static Especialidade getEspecialidades(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo.equals(e.getCodigo())) {
                return e;
            }
        }

        return null;
    }

    public static void excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
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
            for (Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeparaPorPontoEVirgula());
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

    public static void atualizar(Especialidade especialidadeAtualizada) {
        for (Especialidade e : especialidades) {
            if (especialidadeAtualizada.getCodigo() == e.getCodigo()) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, especialidadeAtualizada);
            }
        }
        atualizarArquivo();
    }

    //Criar Lista Inicial de especialidades
    public static void criarlistaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2], Integer.valueOf(vetor[0]));
                especialidades.add(e);
                linha = leitor.readLine();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro lista de especialidade!!");
        }

    }
    
    public static DefaultListModel<Especialidade> getListaDeEspecialidades() {
        DefaultListModel<Especialidade> listaDeEspecialidades = new DefaultListModel<>();
        for (Especialidade i: getEspecialidade()){
            listaDeEspecialidades.addElement(i);
            listaDeEspecialidades.toString();
        }
        return listaDeEspecialidades;
        
    }

    public static DefaultTableModel getEspecialidadesModel() {

        String[] titulos = {
            "CÓDIGO",
            "NOME DA ESPECIALIDADE",
            "DESCRIÇÃO",};

        String[][] dados = new String[especialidades.size()][3];

        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescriçao();
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);

        return model;
    }
    
}
