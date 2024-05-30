package br.com.code.usuarios;

public class Cliente extends Pessoa{
    private Endereco endereco;
    private String telefone;
    protected int pontos;
    protected double lixoDescartado;

    //Exibindo as informações
    @Override
    public String toString() {
        return super.toString() + "\nEndereço: " + endereco.rua + " " + endereco.numero +
                "\nTelefone: " + telefone +
                "\nTotal de pontos: " + pontos +
                "\nQuantidade de lixo descartado: " + lixoDescartado;
    }

    //Construtor
    public Cliente(int id, String cpf, String nome, Genero genero, String dataNasc,
                   boolean cpfValido, Endereco endereco, String telefone, int pontos, double lixoDescartado) {
        super(id, cpf, nome, genero, dataNasc, cpfValido);
        this.endereco = endereco;
        this.telefone = telefone;
        this.pontos = pontos;
        this.lixoDescartado = lixoDescartado;
    }

    //Getters and Setters
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

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getLixoDescartado() {
        return lixoDescartado;
    }

    public void setLixoDescartado(double lixoDescartado) {
        this.lixoDescartado = lixoDescartado;
    }
}
