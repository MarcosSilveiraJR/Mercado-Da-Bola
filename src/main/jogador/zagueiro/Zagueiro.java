package main.jogador.zagueiro;


import main.clube.Clube;
import main.jogador.Jogador;
import main.jogador.financeiro.Apetite;

public class Zagueiro extends Jogador {

    private float descontoValor = 20;


    public Zagueiro(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, Apetite apetiteFinanceiro, double preco, float descontoValor) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.descontoValor = descontoValor;

        if (idade > 30){
            preco = preco * (descontoValor/100);
        }

    }
}
