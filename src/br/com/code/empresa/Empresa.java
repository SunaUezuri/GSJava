package br.com.code.empresa;

import br.com.code.usuarios.Endereco;

public class Empresa {
    protected String cnpj;
    private String nome;
    private Endereco endereco;
    private String telefone;
    protected boolean cnpjValida;

    //Exibindo as informações

    @Override
    public String toString() {
        return "CNPJ: " + cnpj +
                "\nNome da Empresa: " + nome +
                "\nEndereço: " + endereco.getRua() + " " + endereco.getNumero() +
                "\nTelefone: " + telefone;
    }

    //Construtor
    public Empresa(String cnpj, String nome, Endereco endereco, String telefone, boolean cnpjValida) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpjValida = cnpjValida;
    }

    //Getters and Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Método para validar o tamanho de uma CNPJ
    public boolean validaCnpj(String cnpj){
        if (cnpj.length() == 14){
            cnpjValida = true;
        } else {
            cnpjValida = false;
        }
        return cnpjValida;
    }
}
