package jogador;

public class JogadorAutomatico implements Jogador
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
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[0][1]!=null && this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[0][1]==null &&
                this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[0][1]!=null && this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[0][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando ganhar na linha 1
            if (this.tabDoJogo.matriz[1][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]!=null && this.tabDoJogo.matriz[1][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.matriz[1][0]!=null && this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[1][2]!=null && this.tabDoJogo.matriz[1][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[1][0]!=null && this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            // tentando ganhar na linha 2
            if (this.tabDoJogo.matriz[2][0]==null &&
                this.tabDoJogo.matriz[2][1]!=null && this.tabDoJogo.matriz[2][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]==null &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            if (this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]!=null && this.tabDoJogo.matriz[2][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na coluna 0
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][0]!=null && this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][0]==null &&
                this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][0]!=null && this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando ganhar na coluna 1
            if (this.tabDoJogo.matriz[0][1]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]!=null && this.tabDoJogo.matriz[2][1].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.matriz[0][1]!=null && this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][1]!=null && this.tabDoJogo.matriz[2][1].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][1]!=null && this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando ganhar na coluna 2
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][2]!=null && this.tabDoJogo.matriz[1][2].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]==null &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]!=null && this.tabDoJogo.matriz[1][2].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na diagonal principal
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na diagonal secundaria
            if (this.tabDoJogo.matriz[2][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[0][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando atrapalhar vitoria na linha 0
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[0][1]!=null && !this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[0][2]!=null && !this.tabDoJogo.matriz[0][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && !this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[0][1]==null &&
                this.tabDoJogo.matriz[0][2]!=null && !this.tabDoJogo.matriz[0][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && !this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[0][1]!=null && !this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[0][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando atrapalhar vitoria na linha 1
            if (this.tabDoJogo.matriz[1][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]!=null && !this.tabDoJogo.matriz[1][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.matriz[1][0]!=null && !this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[1][2]!=null && !this.tabDoJogo.matriz[1][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[1][0]!=null && !this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            // tentando atrapalhar vitoria na linha 2
            if (this.tabDoJogo.matriz[2][0]==null &&
                this.tabDoJogo.matriz[2][1]!=null && !this.tabDoJogo.matriz[2][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]!=null && !this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.matriz[2][0]!=null && !this.tabDoJogo.matriz[2][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]==null &&
                this.tabDoJogo.matriz[2][2]!=null && !this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            if (this.tabDoJogo.matriz[2][0]!=null && !this.tabDoJogo.matriz[2][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]!=null && !this.tabDoJogo.matriz[2][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na coluna 0
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][0]!=null && !this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]!=null && !this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && !this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][0]==null &&
                this.tabDoJogo.matriz[2][0]!=null && !this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && !this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][0]!=null && !this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando atrapalhar vitoria na coluna 1
            if (this.tabDoJogo.matriz[0][1]==null &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]!=null && !this.tabDoJogo.matriz[2][1].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.matriz[0][1]!=null && !this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][1]!=null && !this.tabDoJogo.matriz[2][1].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][1]!=null && !this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando atrapalhar vitoria na coluna 2
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][2]!=null && !this.tabDoJogo.matriz[1][2].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]!=null && !this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && !this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]==null &&
                this.tabDoJogo.matriz[2][2]!=null && !this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && !this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]!=null && !this.tabDoJogo.matriz[1][2].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na diagonal principal
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]!=null && !this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && !this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][2]!=null && !this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && !this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na diagonal secundaria
            if (this.tabDoJogo.matriz[2][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[0][2]!=null && !this.tabDoJogo.matriz[0][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.matriz[2][0]!=null && !this.tabDoJogo.matriz[2][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[0][2]!=null && !this.tabDoJogo.matriz[0][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[2][0]!=null && !this.tabDoJogo.matriz[2][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[0][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 0
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[0][1]==null &&
                this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[0][1]!=null && this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[0][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[0][1]==null &&
                this.tabDoJogo.matriz[0][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 1
            if (this.tabDoJogo.matriz[1][0]==null &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[1][2]!=null && this.tabDoJogo.matriz[1][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.matriz[1][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.matriz[1][0]!=null && this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[1][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 2
            if (this.tabDoJogo.matriz[2][0]==null &&
                this.tabDoJogo.matriz[2][1]==null &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.matriz[2][0]==null &&
                this.tabDoJogo.matriz[2][1]!=null && this.tabDoJogo.matriz[2][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]==null &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 0
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][0]==null &&
                this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][0]!=null && this.tabDoJogo.matriz[1][0].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][0]==null &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 1
            if (this.tabDoJogo.matriz[0][1]==null &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][1]!=null && this.tabDoJogo.matriz[2][1].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.matriz[0][1]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][1]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.matriz[0][1]!=null && this.tabDoJogo.matriz[0][1].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][1]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 2
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][2]==null &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][2]!=null && this.tabDoJogo.matriz[1][2].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][2]==null &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal principal
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal secundaria
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // termine jogando num lugar qualquer que esteja livre
            if (this.tabDoJogo.matriz[1][1]==null && this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1));
            if (this.tabDoJogo.matriz[0][0]==null && this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0));
            if (this.tabDoJogo.matriz[0][2]==null && this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2));
            if (this.tabDoJogo.matriz[2][0]==null && this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0));
            if (this.tabDoJogo.matriz[2][2]==null && this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2));
        }
        catch (Exception erro)
        {} // ignorando pois sei que n o estou usando posicao invalida nem comparando com equals um null
    }
}