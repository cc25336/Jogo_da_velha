package partes.jogador;
import java.io.*;

import partes.Marca;
import partes.Tabuleiro;

public class JogadorHumano implements Jogador, Cloneable
{
    private Marca          marca     = null;
    private Tabuleiro      tabDoJogo = null;
    private BufferedReader teclado   = new BufferedReader
                                        (new InputStreamReader
                                        (System.in));

    public JogadorHumano (Tabuleiro tab) throws Exception
    {
        if (tab == null) throw new Exception("Tabuleiro não fornecido");
        String marcaDigitada = null;
        do {
            try {
                System.out.print("Escolha sua marca(X ou O): ");
                marcaDigitada = teclado.readLine();
            } catch (IOException erro) {
                System.out.println("Erro ao ler sua opção.");
            }
            if (marcaDigitada.length() != 1 || (Character.toUpperCase(marcaDigitada.charAt(0)) != 'X' && Character.toUpperCase(marcaDigitada.charAt(0)) != 'O')) {
                System.out.println("Marca inválida, digite novamente.\n");
            }
        } while (marcaDigitada.length() != 1 || (Character.toUpperCase(marcaDigitada.charAt(0)) != 'X' && Character.toUpperCase(marcaDigitada.charAt(0)) != 'O'));

        this.tabDoJogo = tab;
        this.marca = new Marca(Character.toUpperCase(marcaDigitada.charAt(0)));
        // atribuir tab para tabDoJogo
        // pedir para o jogador escolher
        // sua marca e permitir digitacao
        // intanciando marca

    }

    public JogadorHumano (Tabuleiro tab, Marca mrc) throws Exception
    {
        if (tab==null) throw new Exception ("Tabuleiro não fornecido.");
        if (mrc==null) throw new Exception ("Marca não fornecida.");
        this.tabDoJogo = tab;
        this.marca = mrc;
        System.out.println("Sua marca é " + this.marca);
        // atribuir tab para tabDoJogo
        // e mrc para marca
    }

    public Marca getMarca ()
    {
        return this.marca;
        // retorna a marca do jogador
    }

    public void facaSuaJogada ()
    {
        String jogada = "";
        char coluna = 'A';
        int colunaReal = 0;
        int linha = 0;
        for (;;) {
            try {
                System.out.print("Escolha uma posição e faça sua jogada (Ex.: A1): ");
                jogada = teclado.readLine();
            } catch (IOException erro) {
                System.err.println("Erro ao ler sua opção.");
            }
            if (jogada.length() != 2) {
                System.out.println("Jogada inválida, tente novamente");
            }
            else {
                coluna = Character.toUpperCase(jogada.charAt(0));
                linha = jogada.charAt(1) - '0';
                boolean haMarcaNaPosicao = false;
                try {
                    if (coluna == 'A') colunaReal = 0;
                    else if (coluna == 'B') colunaReal = 1;
                    else if (coluna == 'C') colunaReal = 2;
                    haMarcaNaPosicao = this.tabDoJogo.haMarcaNaPosicao(linha-1, colunaReal);
                } catch (Exception erro) {}

                if (((coluna == 'A' || coluna == 'B' || coluna == 'C') && (linha == 1 || linha == 2 || linha == 3)) && !haMarcaNaPosicao) break;
                System.out.println("Jogada inválida, tente novamente");
            }
        }

        try {
            this.tabDoJogo.setMarcaNaPosicao(this.marca, linha-1, colunaReal);
        }
        catch (Exception erro)
        {}
        // pergunta para o jogador onde ele quer
        // jogar, permitindo digitacao e chamando
        // os métodos apropriados de tabDoJogo
    }

    public void vcGanhou ()
    {
        System.out.println("Parabéns, vc ganhou!");
        // mostra mensagem indicando vitoria
    }
    
    public void vcPerdeu ()
    {
        System.out.println("Ah que pena, você perdeu.");
        // mostra mensagem indicando derrota
    }
    
    public void deuVelha ()
    {
        System.out.println("Deu velha!");
        // mostra mensagem indicando empate
    }

    public boolean querMaisUmaPartida ()
    {
        String resposta = "";
        do {
            System.out.print("Deseja jogar mais uma partida? (S/N) ");
            try {
                resposta = teclado.readLine();
            } catch (IOException erro) {
                System.out.println("Erro ao ler sua opção.");
            }
            if (resposta.length() != 1 || (Character.toUpperCase(resposta.charAt(0)) != 'S' && Character.toUpperCase(resposta.charAt(0)) != 'N')) {
                System.out.println("Digite somente S ou N, digite novamente.\n");
            }
            else if (Character.toUpperCase(resposta.charAt(0)) == 'N') return false;

        } while (resposta.length() != 1 || (Character.toUpperCase(resposta.charAt(0)) != 'S' && Character.toUpperCase(resposta.charAt(0)) != 'N'));
        return true;
        // perguntar se deseja jogar de novo
        // permitindo digitacao e retornando
        // true ou false, conforme a resposta
    }

     @Override
    public String toString (){
        return "Marca: " + this.marca;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        JogadorHumano j = (JogadorHumano)obj;
        if (!j.marca.equals(this.marca)) return false;
        if (!j.tabDoJogo.equals(this.tabDoJogo)) return false;
        if (!j.teclado.equals(this.teclado)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int ret = 7;
        ret = ret * 31 + (this.marca).hashCode();
        ret = ret * 31 + (this.tabDoJogo).hashCode();
        ret = ret * 31 + (this.teclado).hashCode();
        if (ret < 0) ret = -ret;
        return ret;
    }
    
    public JogadorHumano (JogadorHumano modelo) throws Exception{
        if (modelo == null) throw new Exception("Modelo ausente");
        this.marca = modelo.marca;
        this.tabDoJogo = modelo.tabDoJogo;
        this.teclado = modelo.teclado;
    }

    public Object clone(){
        JogadorHumano ret = null;
        try{
            ret = new JogadorHumano(this);
        } catch(Exception e){}
        return ret;
    }
}