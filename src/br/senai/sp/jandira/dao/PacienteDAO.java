package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Paciente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PacienteDAO {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public static Paciente getPaciente(String cpf) {
        for (Paciente p : pacientes) {
            if (cpf == p.getCpf()) {
                return p;
            }
        }
        return null;
    }
    

    public static void gravar(Paciente p) {
        pacientes.add(p);
    }

    public static void atualizar(Paciente pacienteAtuzalido) {
        for (Paciente p : pacientes) {
            if (pacienteAtuzalido.getCpf() == p.getCpf()) {
                int posicao = pacientes.indexOf(p);
                pacientes.set(posicao, pacienteAtuzalido);
            }
        }
    }

    public static void excluir(String cpf) {
        for (Paciente p : pacientes) {
            if (cpf == p.getCpf()) {
                pacientes.remove(p);
                break;
            }
        }
    }
    
    public static void criarListaPacientes(){
        
        Paciente p1 = new Paciente("André", LocalDate.of(1994, 10, 13), "11940028922", "123.45678-0", "517-234-984-04");
        Paciente p2 = new Paciente("André", LocalDate.of(1994, 10, 13), "11940028922", "123.45678-0", "517-234-984-04");
        Paciente p3 = new Paciente("André", LocalDate.of(1994, 10, 13), "11940028922", "123.45678-0", "517-234-984-04");
        Paciente p4 = new Paciente("André", LocalDate.of(1994, 10, 13), "11940028922", "123.45678-0", "517-234-984-04");
        
        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
        pacientes.add(p4);
        
    }
    
    public static DefaultTableModel getPacientesModel(){
        
        String[] titulos = {
            "CÓDIGO",
            "NOME",
            "DATA",
            "TELEFONE",
            "RG",
            "CPF",
        };
        
        String[][] dados = new String[pacientes.size()][6];
        
        int i = 0;
        for(Paciente p: pacientes){
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNome();
            DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][2] = p.getDataDeNascimento().format(formatacao);
            dados[i][3] = p.getTelefone();
            dados[i][4] = p.getRg();
            dados[i][5] = p.getCpf();
            
            i++;
                    
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
        
    }

}
