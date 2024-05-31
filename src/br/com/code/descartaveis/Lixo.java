package br.com.code.descartaveis;
import br.com.code.usuarios.*;


public abstract class Lixo {

    private CategoriaLixo categoria;
    protected double peso;
    protected int quantidade;
    private String dataColeta;

    @Override
    public String toString() {
        return "Categoria: " + categoria +
                "\nPeso: " + peso +
                "\nQuantidade: " + quantidade +
                "\nData de coleta: " + dataColeta;
    }

    //Construtor
    public Lixo(CategoriaLixo categoria, double peso, int quantidade, String dataColeta) {
        this.categoria = categoria;
        this.peso = peso;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
    }

    //Getters and Setters
    public CategoriaLixo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaLixo categoria) {
        this.categoria = categoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(String dataColeta) {
        this.dataColeta = dataColeta;
    }
}
