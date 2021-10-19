package main.jogador.atacante;

import main.clube.Clube;
import main.jogador.Jogador;
import main.jogador.financeiro.Apetite;

public class Atacante extends Jogador {
    private final int getReputacaoHistorica;
    private int qtdGols;
    private String interesse;
    

    public Atacante(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, Apetite apetiteFinanceiro, double preco, int qtdGols, String interesse) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.qtdGols = qtdGols;
        this.getReputacaoHistorica = reputacaoHistorica;
        this.interesse = interesse;
        
    }



    }



