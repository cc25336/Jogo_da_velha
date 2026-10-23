package partes.jogador;
import partes.Marca;
import partes.Tabuleiro;

public class JogadorAutomatico implements Jogador, Cloneable
{
    private Marca     marca     = null;
    private Tabuleiro tabDoJogo = null;

    public JogadorAutomatico (Tabuleiro tab) throws Exception
    {   tabDoJogo = tab;
        // atribuir tab para tabDoJogo
        // fazer o jogador escolher sua marca
        // via sorteio de numeros aleatorio
        if ((int)(Math.random()*2) == 0)
            marca=new Marca('X');
        else
            marca=new Marca('O');
    }

    public JogadorAutomatico (Tabuleiro tab, Marca mrc) throws Exception
    {
        this.tabDoJogo = tab;
        this.marca = mrc;
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
        try
        {
            // tentando ganhar na linha 0
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando ganhar na linha 1
            if (this.tabDoJogo.getMarcaNaPosicao(1, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            // tentando ganhar na linha 2
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na coluna 0
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando ganhar na coluna 1
            if (this.tabDoJogo.getMarcaNaPosicao(0, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando ganhar na coluna 2
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na diagonal principal
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na diagonal secundaria
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando atrapalhar vitoria na linha 0
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando atrapalhar vitoria na linha 1
            if (this.tabDoJogo.getMarcaNaPosicao(1, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            // tentando atrapalhar vitoria na linha 2
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na coluna 0
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando atrapalhar vitoria na coluna 1
            if (this.tabDoJogo.getMarcaNaPosicao(0, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando atrapalhar vitoria na coluna 2
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na diagonal principal
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na diagonal secundaria
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && !this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && !this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && !this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 0
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(0, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(0, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 1
            if (this.tabDoJogo.getMarcaNaPosicao(1, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(1, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 2
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 0
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 1
            if (this.tabDoJogo.getMarcaNaPosicao(0, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 1).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 1)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 2
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal principal
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 0).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 2)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal secundaria
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)!=null && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)==null &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)!=null && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.getMarcaNaPosicao(0, 2)!=null && this.tabDoJogo.getMarcaNaPosicao(0, 2).equals(this.marca) &&
                this.tabDoJogo.getMarcaNaPosicao(1, 1)==null &&
                this.tabDoJogo.getMarcaNaPosicao(2, 0)==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // termine jogando num lugar qualquer que esteja livre
            if      (this.tabDoJogo.getMarcaNaPosicao(1, 1)==null) this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else if (this.tabDoJogo.getMarcaNaPosicao(0, 0)==null) this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else if (this.tabDoJogo.getMarcaNaPosicao(0, 2)==null) this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else if (this.tabDoJogo.getMarcaNaPosicao(2, 0)==null) this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else if (this.tabDoJogo.getMarcaNaPosicao(2, 2)==null) this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else if (this.tabDoJogo.getMarcaNaPosicao(0, 1)==null) this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else if (this.tabDoJogo.getMarcaNaPosicao(1, 0)==null) this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else if (this.tabDoJogo.getMarcaNaPosicao(1, 2)==null) this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
        }
        catch (Exception erro)
        {} // ignorando pois sei que n o estou usando posicao invalida nem comparando com equals um null
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
        JogadorAutomatico j = (JogadorAutomatico)obj;
        if (!j.marca.equals(this.marca)) return false;
        if (!j.tabDoJogo.equals(this.tabDoJogo)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int ret = 7;
        ret = ret * 31 + (this.marca).hashCode();
        ret = ret * 31 + (this.tabDoJogo).hashCode();
        if (ret < 0) ret = -ret;
        return ret;
    }
    
    public JogadorAutomatico (JogadorAutomatico modelo) throws Exception{
        if (modelo == null) throw new Exception("Modelo ausente");
        this.marca = modelo.marca;
        this.tabDoJogo = modelo.tabDoJogo;
    }

    public Object clone(){
        JogadorAutomatico ret = null;
        try{
            ret = new JogadorAutomatico(this);
        } catch(Exception e){}
        return ret;
    }
}