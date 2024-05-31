package br.com.code.usuarios;
import br.com.code.empresa.*;

public class Funcionario extends Pessoa{

    private Empresa empresa;
    private Veiculo veiculo;

    @Override
    public String toString() {
        return super.toString() + "\nEmpresa da qual foi enviado: " + empresa.getNome() +
                "\nVeículo que está utilizando: " + veiculo.getCategoria() + " do modelo "+ veiculo.getModelo();
    }

    //Construtor da classe

    public Funcionario(int id, String cpf, String nome, Genero genero,
                       String dataNasc, Empresa empresa, Veiculo veiculo) {
        super(id, cpf, nome, genero, dataNasc);
        this.empresa = empresa;
        this.veiculo = veiculo;
    }

    //Getters and Setters

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}

