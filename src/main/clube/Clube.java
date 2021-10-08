package main.clube;

public class Clube {

    private String nome;
    private int reputacaoHistorica;
    private double saldoDisponivel;

    public Clube(String nome, int reputacaoHistorica, double saldoDisponivel) {
        this.nome = nome;
        this.reputacaoHistorica = reputacaoHistorica;
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public int getReputacaoHistorica() {
        return reputacaoHistorica;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }
}
