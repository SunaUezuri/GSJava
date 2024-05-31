package br.com.code;
import br.com.code.usuarios.*;
import br.com.code.empresa.*;
import br.com.code.descartaveis.*;
import br.com.code.pontos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TestaClasses {
    public static void main(String[] args) {

        //Instanciando as classes necessárias

        //Endereço da empresa
        Endereco chaves = new Endereco("06409-000", "Jardim Califórnia", "Chaves",
                341, null, "Barueri");

        //Endereço do ponto de coleta
        Endereco adolfo = new Endereco("04734-000", "Avenida", "Adolfo Pinheiro", 256,
                null, "Santo Amaro");

        Empresa luvitec = new Empresa("04489943000180", "Luvitec", chaves, "(11) 4198-2134");

        Veiculo saveiro = new Veiculo("DZA7834", CategoriaVeiculo.CARRO, "Saveiro", "Volkswagen",
                "Prata", true);

        Funcionario judas = new Funcionario(40, "11671955820", "Judas Santos", Genero.MASCULINO,
                "11/12/1998", luvitec, saveiro);

        PontoColeta santo = new PontoColeta(adolfo, 500, "07:00-19:00",
                null, "Papel, Plástico, Metal e Vidro");


        //Cadastrando o cliente

        JOptionPane.showMessageDialog(null, "Bem-vindo à CodeGenius!" +
                "\nPara prosseguir por favor insira suas informações.");


        String cpf = JOptionPane.showInputDialog("Insira seu CPF: ");
        String nome = JOptionPane.showInputDialog("Insira aqui seu username: ");
        Genero genero = Genero.valueOf(
                JOptionPane.showInputDialog("Insira seu gênero (MASCULINO, FEMININO, OUTROS): "));
        String dataNasc = JOptionPane.showInputDialog("Insira aqui a sua data de nascimento: ");
        String telefone = JOptionPane.showInputDialog("Insira aqui um número para contato: ");

        //Cadastrando o endereço do cliente
        JOptionPane.showMessageDialog(null, "Agora por favor insira os dados do seu endereço.");
        String cep = JOptionPane.showInputDialog("Seu CEP: ");
        String logradouro = JOptionPane.showInputDialog("Seu Logradouro: ");
        String rua = JOptionPane.showInputDialog("Nome da rua: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("O número: "));
        String complemento = JOptionPane.showInputDialog("Complemento (caso não haja digite null): ");
        String bairro = JOptionPane.showInputDialog("E seu bairro: ");

        Endereco enderecoCliente = new Endereco(cep, logradouro, rua, numero, complemento, bairro);

        //Instanciando um cliente
        Cliente alexandra = new Cliente(15, cpf, nome, genero, dataNasc, enderecoCliente, telefone);

        //Inserindo a mensagem que mostra os dados
        JOptionPane.showMessageDialog(null, alexandra);

    }
}
