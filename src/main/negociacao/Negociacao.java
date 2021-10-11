package main.negociacao;

import main.jogador.*;

import main.clube.Clube;
import main.jogador.Jogador;
import main.jogador.meioCampo.MeioCampo;


public class Negociacao {

    private MeioCampo meioCampo;

    public boolean negociar(Clube clube, Jogador goleiro) {

        if (goleiro.equals(meioCampo)) {
            MeioCampo.negociacaoMeioCampo(goleiro, clube);
        }

        return false;
    }


}
