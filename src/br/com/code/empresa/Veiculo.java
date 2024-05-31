package br.com.code.empresa;

public class Veiculo {

    private String placa;
    private CategoriaVeiculo categoria;
    private String modelo;
    private String marca;
    private String cor;
    private boolean pertenceEmpresa;

    //To String para mostrar os dados

    @Override
    public String toString() {
        return "Placa: " + placa +
                "\nCategoria do veículo: " + categoria +
                "\nModelo: " + modelo +
                "\nMarca: " + marca +
                "\nCor: " + cor +
                "\nVeículo é da empresa?: " + pertenceEmpresa;
    }

    //Construtor da classe
    public Veiculo(String placa, CategoriaVeiculo categoria,
                   String modelo, String marca, String cor, boolean pertenceEmpresa) {
        this.placa = placa;
        this.categoria = categoria;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.pertenceEmpresa = pertenceEmpresa;
    }

    //Getters and Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public CategoriaVeiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVeiculo categoria) {
        this.categoria = categoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPertenceEmpresa() {
        return pertenceEmpresa;
    }

    public void setPertenceEmpresa(boolean pertenceEmpresa) {
        this.pertenceEmpresa = pertenceEmpresa;
    }
}
