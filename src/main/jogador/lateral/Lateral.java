package main.jogador.lateral;

import main.clube.Clube;
import main.jogador.Jogador;
import main.jogador.financeiro.Apetite;

public class Lateral extends Jogador {

    public final int cruzamentoCertAno;
    public final float percentual = 2;
    public final float percentual2 = 30;


    public Lateral(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, Apetite apetiteFinanceiro, double preco, int cruzamentoCertAno) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.cruzamentoCertAno = cruzamentoCertAno;

        if (cruzamentoCertAno > 0) {
            preco = (cruzamentoCertAno + (percentual / 100));
        } else if (idade > 28) {
            preco = (preco - (percentual2 / 100));

        }


    }
}
