package main.jogador.meioCampo;

import main.clube.Clube;
import main.jogador.Jogador;
import main.jogador.financeiro.Apetite;
import main.clube.Clube;
import main.negociacao.Negociacao;

public class MeioCampo extends Jogador {

    private final float percentual = 30;

    public MeioCampo(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, Apetite apetiteFinanceiro, double preco) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);

        if (idade > 30) {
            this.preco = preco * (percentual / 100);
        }
    }

    public static void negociacaoMeioCampo(Jogador meioCampo, Clube clube){

        if (meioCampo.getReputacaoHistorica() >= clube.getReputacaoHistorica() -2) {

        } else {
            System.out.println("Não foi possível negociar, reputação histórica não atende os requisitos");
        }
    }
}


