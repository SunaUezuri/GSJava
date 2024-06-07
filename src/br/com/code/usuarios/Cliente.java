package br.com.code.usuarios;

public class Cliente extends Pessoa{
    private Endereco endereco;
    private String telefone;
    protected double pontos = 0;
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

    public double getPontos() {
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
    public double calculaPontos(String tipo, double peso){
        switch (tipo){

            case "lata", "Latinha", "Lata", "latinha":
                if (peso >= 1){

                    pontos = peso * 750;
                    break;
                }

            case "Papelão", "papelão":
                if (peso >= 1){

                    pontos = peso * 110;
                    break;
                }

            case "Plástico", "plastico", "plástico":
                if (peso >= 1){

                    pontos = peso * 125;
                    break;
                }

            case "papel", "Papel":
                if (peso >= 1){

                    pontos = peso * 144;
                    break;
                }

            case "Orgânico", "orgânico":
                if (peso >= 1){
                    pontos = peso * 100;
                    break;
                }

        }

        return pontos;
    }

    //Calculando por quantidade
    public double calculaPontos(String tipo, int quantidade){
        if (tipo.equalsIgnoreCase("Garrafa") && quantidade >= 10){

            pontos = (quantidade / 10.0) * 275;
        }
        return pontos;
    }

}
