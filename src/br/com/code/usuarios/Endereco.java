package br.com.code.usuarios;

public class Endereco {
    private String cep;
    private String logradouro;
    protected String rua;
    protected int numero;
    private String complemento;
    private String bairro;

    //Método para exibir as informações
    @Override
    public String toString() {
        return "CEP: " + cep +
                "\nLogradouro: " + logradouro +
                "\nRua: " + rua +
                "\nNumero: " + numero +
                "\nComplemento: " + complemento +
                "\nBairro: " + bairro;
    }

    //Construtor
    public Endereco(String cep, String logradouro, String rua, int numero, String complemento, String bairro) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    //Getters and Setters
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
