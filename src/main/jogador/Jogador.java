package main.jogador;

import main.clube.Clube;
import main.jogador.financeiro.Apetite;

import java.math.BigDecimal;

public abstract class Jogador {

    private String nome;
    private int idade;
    private Clube clubeAtual;
    private int reputacaoHistorica;
    private Apetite apetiteFinanceiro;
    private double preco;
    private final double INDIFERENTE = 1;
    private final double CONSERVADOR = 1.4;
    private final double MERCENARIO = 1.8;


    public Jogador(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, Apetite apetiteFinanceiro, double preco) {
        this.nome = nome;
        this.idade = idade;
        this.clubeAtual = clubeAtual;
        this.reputacaoHistorica = reputacaoHistorica;
        this.apetiteFinanceiro = apetiteFinanceiro;
        this.preco = preco;
    }

    public String getClubeAtual() {
        if (clubeAtual == null) {
            return "Sem Clube";

        } else {
            return clubeAtual.getNome();
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setClubeAtual(Clube clubeAtual) {
        this.clubeAtual = clubeAtual;
    }

    public int getReputacaoHistorica() {
        return reputacaoHistorica;
    }

    public void setReputacaoHistorica(int reputacaoHistorica) {
        this.reputacaoHistorica = reputacaoHistorica;
    }

    public Apetite getApetiteFinanceiro() {
        return apetiteFinanceiro;
    }

    public void setApetiteFinanceiro(Apetite apetiteFinanceiro) {
        this.apetiteFinanceiro = apetiteFinanceiro;
    }

    public double getPreco() {
        if (this.apetiteFinanceiro.equals(Apetite.CONSERVADOR)){
            return this.preco = preco * CONSERVADOR;
        }else if (this.apetiteFinanceiro.equals(Apetite.MERCENARIO)){
            return this.preco = preco * MERCENARIO;
        } else {
            return preco * INDIFERENTE;
        }
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}






