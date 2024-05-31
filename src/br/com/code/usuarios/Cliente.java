package br.com.code.usuarios;

public class Cliente extends Pessoa{
    private Endereco endereco;
    private String telefone;
    protected int pontos = 0;
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
                   Endereco endereco, String telefone) {
        super(id, cpf, nome, genero, dataNasc);
        this.endereco = endereco;
        this.telefone = telefone;
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

    public double getLixoDescartado() {
        return lixoDescartado;
    }

    public void setLixoDescartado(double lixoDescartado) {
        this.lixoDescartado = lixoDescartado;
    }

    //Método para calcular os pontos

    //Calculando por peso
    public int calculaPontos(double peso){
        if (peso >= 5 && peso <= 9){
            pontos += 1;
        } else if (peso >= 10) {
            pontos += 2;
        }
        return pontos;
    }

    //Calculando por quantidade
    public int calculaPontos(int quantidade){
        if (quantidade >= 10 && quantidade <= 14){
            pontos += 1;
        } else if (quantidade >= 15){
            pontos += 2;
        }
        return pontos;
    }

    //Calculando um bônus caso o descartável seja Plático
    public int calculaPontos(String tipo){
        if (tipo.equalsIgnoreCase("plastico")){
            pontos += 5;
        }
        return pontos;
    }
}
