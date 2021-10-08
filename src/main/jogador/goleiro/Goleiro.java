package main.jogador.goleiro;

import main.clube.Clube;
import main.jogador.Jogador;
import main.jogador.financeiro.Apetite;

import java.math.BigDecimal;

public class Goleiro extends Jogador {

    private int qtdPenaltydef;

    public Goleiro(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, Apetite apetiteFinanceiro, double preco, int qtdPenaltydef) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.qtdPenaltydef = qtdPenaltydef;
    }

}
