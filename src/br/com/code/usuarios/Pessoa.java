package br.com.code.usuarios;

public abstract class Pessoa {
    private int id;
    protected String cpf;
    private String nome;
    private Genero genero;
    private String dataNasc;
    protected boolean cpfValido;

    //Exibindo os dados do usuário
    @Override
    public String toString() {
        return "ID: " + id +
                "\nCPF: " + cpf +
                "\nNome: " + nome +
                "\nGenero: " + genero +
                "\nData de Nascimento: " + dataNasc;
    }

    //Criando o construtor da classe
    public Pessoa(int id, String cpf, String nome, Genero genero, String dataNasc) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.genero = genero;
        this.dataNasc = dataNasc;
    }

    //Getters and Setters da classe

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public boolean isCpfValido() {
        return cpfValido;
    }

    public void setCpfValido(boolean cpfValido) {
        this.cpfValido = cpfValido;
    }


    //Método para validar o tamanho do CPF
    public boolean validaCpf(String cpf){
        if (cpf.length() == 11){
            cpfValido = true;
        }else {
            cpfValido = false;
        }
        return cpfValido;
    }
}
