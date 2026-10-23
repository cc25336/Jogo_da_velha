
import java.io.*;

import partes.AnalistaSituacional;
import partes.Marca;
import partes.Tabuleiro;
import partes.jogador.*;

public class Velha
{
    public static void main (String args [])
    {
        Tabuleiro           tabDoJogo;

        Jogador             jogadorDaVez = null;
        JogadorHumano       jogadorH     = null;
        JogadorAutomatico   jogadorA     = null;

        AnalistaSituacional analista;

        boolean jogadorHumanoComeca = (int)(Math.random()*2) == 0;

        do
        {
            try
            {
                tabDoJogo = new Tabuleiro ();

                if (jogadorHumanoComeca)
                {
                    jogadorH = new JogadorHumano (tabDoJogo);
                    jogadorA = new JogadorAutomatico
                              (tabDoJogo,
                               new Marca(jogadorH.getMarca().getSimbolo()=='X'?'O':'X'));

                    jogadorDaVez=jogadorH;
                }
                else
                {
                    jogadorA = new JogadorAutomatico (tabDoJogo);
                    jogadorH = new JogadorHumano
                              (tabDoJogo,
                               new Marca(jogadorA.getMarca().getSimbolo()=='X'?'O':'X'));

                    jogadorDaVez=jogadorA;
                }

                analista = new AnalistaSituacional (tabDoJogo);

                do
                {
                    jogadorDaVez.facaSuaJogada();

                    if (jogadorDaVez==jogadorH)
                        jogadorDaVez=jogadorA;
                    else
                        jogadorDaVez=jogadorH;
                }
                while (!analista.fimDeJogo());

                if (analista.getMarcaDoVencedor().equals(jogadorH.getMarca()))
                    jogadorH.vcGanhou ();
                else
                    if (analista.getMarcaDoVencedor().equals(jogadorA.getMarca()))
                        jogadorH.vcPerdeu ();
                    else
                        jogadorH.deuVelha ();

                jogadorHumanoComeca = !jogadorHumanoComeca;
            }
            catch (Exception e)
            {}
        }
        while (jogadorH.querMaisUmaPartida());
    }
}