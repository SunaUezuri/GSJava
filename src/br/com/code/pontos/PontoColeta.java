package br.com.code.pontos;

import br.com.code.usuarios.Endereco;

public class PontoColeta {

    private Endereco localizacao;
    private double armazenamento;
    private String horarioFuncionamento;
    private String historicoColeta;
    private String aceitos;

    @Override
    public String toString() {
        return "Localização: " + localizacao.getRua() + " " + localizacao.getNumero() +
                "\nCapacidade de armazenamento: " + armazenamento +
                "\nHorário de funcionamento: " + horarioFuncionamento +
                "\nHistórico de coleta: " + historicoColeta +
                "\nAceitamos: " + aceitos;

    }

    //Construtor

    public PontoColeta(Endereco localizacao, double armazenamento,
                       String horarioFuncionamento, String historicoColeta, String aceitos) {
        this.localizacao = localizacao;
        this.armazenamento = armazenamento;
        this.horarioFuncionamento = horarioFuncionamento;
        this.historicoColeta = historicoColeta;
        this.aceitos = aceitos;
    }

    //Getters and Setters

    public Endereco getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Endereco localizacao) {
        this.localizacao = localizacao;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getHistoricoColeta() {
        return historicoColeta;
    }

    public void setHistoricoColeta(String historicoColeta) {
        this.historicoColeta = historicoColeta;
    }

    public String getAceitos() {
        return aceitos;
    }

    public void setAceitos(String aceitos) {
        this.aceitos = aceitos;
    }
}
