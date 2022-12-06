package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {

    private String nome;
    private LocalDate dataDeNascimento;
    private String telefone;
    private Endereco endereco;
    private String rg;
    private String cpf;
    private PlanoDeSaude planoDeSaude;
    private Integer codigo;
    private static int contador = 99;

    public Paciente(){
        gerarCodigo();
    }
    
    public Paciente(String cpf) {
        this.cpf = cpf;
        gerarCodigo();
    }
    
    public Paciente(String nome, LocalDate dataDeNascimento, String telefone, String rg, String cpf){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        gerarCodigo();
    }
    
    public Paciente(String nome, LocalDate dataDeNascimento, String telefone, 
            Endereco endereco, String rg, String cpf, PlanoDeSaude planoDeSaude){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.rg = rg;
        this.cpf = cpf;
        this.planoDeSaude = planoDeSaude;
        gerarCodigo();
    }
    
    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    public void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

}
