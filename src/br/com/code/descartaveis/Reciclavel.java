package br.com.code.descartaveis;

public class Reciclavel extends Lixo{

    private String produto;
    private String material;

    @Override
    public String toString() {
        return super.toString() + "\nProduto: " + produto +
                "\nMaterial: " + material;
    }

    //Construtor

    public Reciclavel(CategoriaLixo categoria, double peso,
                      int quantidade, String dataColeta, String produto, String material) {
        super(categoria, peso, quantidade, dataColeta);
        this.produto = produto;
        this.material = material;
    }

    //Getters and Setters

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
