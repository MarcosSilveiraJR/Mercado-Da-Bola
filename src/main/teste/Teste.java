package main.teste;

import main.clube.Clube;
import main.jogador.Jogador;
import main.jogador.atacante.Atacante;
import main.jogador.goleiro.Goleiro;
import main.jogador.meioCampo.MeioCampo;
import main.negociacao.Negociacao;
import org.junit.Assert;
import org.junit.Test;

import static main.jogador.financeiro.Apetite.*;

public class Teste {

    @Test
    public void deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Grêmio", 10, 100000000);
        Goleiro goleiro = new Goleiro("Marcelo Grohe", 33, null,
                8, INDIFERENTE , 800500, 12);

        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, 100000000);
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 10, INDIFERENTE, 800500, 20);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void negociacaoMeioCampo(){

        Negociacao negociacao = new Negociacao();

        Clube clube = new Clube("Internacional", 9, 100000000);
        MeioCampo meioCampo = new MeioCampo("Cristiano Ronaldo", 35, null, 10, INDIFERENTE, 800500);

    }


}
