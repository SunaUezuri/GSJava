package br.com.code.descartaveis;

public class Organico extends Lixo{

    private String tipo;
    private String dataDescarte;

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo +
                "\nData do descarte: " + dataDescarte;
    }

    //Construtor

    public Organico(CategoriaLixo categoria, double peso, int quantidade,
                    String dataColeta, String tipo, String dataDescarte) {
        super(categoria, peso, quantidade, dataColeta);
        this.tipo = tipo;
        this.dataDescarte = dataDescarte;
    }

    //Getters and Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataDescarte() {
        return dataDescarte;
    }

    public void setDataDescarte(String dataDescarte) {
        this.dataDescarte = dataDescarte;
    }
}
