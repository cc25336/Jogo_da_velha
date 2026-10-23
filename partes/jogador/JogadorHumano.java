package partes.jogador;
import java.io.*;
import partes.Marca;
import partes.Tabuleiro;

public class JogadorHumano implements Jogador
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
                System.err.println("Erro ao ler sua opção.");
            }
            if (marcaDigitada.length() != 1 || (marcaDigitada.charAt(0) != 'X' && marcaDigitada.charAt(0) != 'O') ) {
                System.out.println("Marca inválida, digite novamente.\n");
            }
        } while (marcaDigitada.length() != 1 || (marcaDigitada.charAt(0) != 'X' && marcaDigitada.charAt(0) != 'O') );

        this.tabDoJogo = tab;
        this.marca = new Marca(marcaDigitada.charAt(0));
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
        // atribuir tab para tabDoJogo
        // e mrc para marca
    }

    public Marca getMarca ()
    {
        // retorna a marca do jogador
        return this.marca;
    }

    public void facaSuaJogada ()
    {
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
        do {
            System.out.print("Deseja jogar mais uma partida? (S/N) ");
            String resposta = teclado.readLine();
        }
        return true;
        // perguntar se deseja jogar de novo
        // permitindo digitacao e retornando
        // true ou false, conforme a resposta
    }
}