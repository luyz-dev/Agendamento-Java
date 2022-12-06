package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public final class Medico {

    private String nome;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    private ArrayList<Especialidade> especialidade;
    private Integer codigo;
    private static int contador = 99;

    public Medico() {
        gerarCodigo();
    }

    public Medico(String crm, String nome, String telefone) {
        gerarCodigo();
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;

    }

    public Medico(String crm, String nome, String telefone, Integer codigo) {
        gerarCodigo();
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.codigo = codigo;
        this.contador = codigo;
    }
    
    public Medico(String crm, String nome, String telefone, LocalDate dataDeNascimento ,Integer codigo, String email, ArrayList<Especialidade> especialidade) {
        gerarCodigo();
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = codigo;
        this.contador = codigo;
        this.email = email;
        this.especialidade = especialidade;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";"+ this.email + ";" + this.dataDeNascimento + ";" + converteArrayParaString(especialidade);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(ArrayList<Especialidade> especialidade) {
        this.especialidade = especialidade;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getMedicosSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" +this.dataDeNascimento + ";" + converteArrayParaString(this.especialidade);
    }

    public String converteArrayParaString(ArrayList<Especialidade> lista){
        ArrayList<String> codigos = new ArrayList<>();
        for(Especialidade e: lista){
            codigos.add(e.getCodigo().toString());
        }
        return String.join(";", codigos);
    }

}
