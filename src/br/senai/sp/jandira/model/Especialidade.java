package br.senai.sp.jandira.model;

public class Especialidade {

    private Integer codigo;
    private String nome;
    private String descricao;
    private static int contador = 99;

    // Construtores da classe
    public Especialidade() { // Construtor Default/Padrão
        gerarCodigo();
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao, Integer codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.contador = codigo;
    }

    public String getEspecialidadeSeparaPorPontoEVirgula() {
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }

    // Métodos de acesso aos atributos
    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescriçao() {
        return descricao;
    }

    public String toString() {
        return this.nome;
    }
}
