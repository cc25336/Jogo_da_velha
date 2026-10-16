public class AnalistaSituacional
{
    private Tabuleiro tabDoJogo;

    public AnalistaSituacional (Tabuleiro tab) throws Exception //feito
    {
        // colocar tab em tabDoJogo
        if (tab == null) throw new Exception ("Tabuleiro inválido.");
        this.tabDoJogo = (Tabuleiro) tab.clone();
    }

    public Marca getMarcaDoVencedor ()
    {
        // descobrir se ha um vencedor e retornar
        // a marca dele; retornara null, quando
        // nao houver vencedor
        for (int lin = 0; lin<3; lin++) {
            
        }
    }

    private boolean tabuleiroCheio () //feito
    {
        // verificar se todas as posicoes do
        // tabuleiro estao preenchidas (!=null)
        // retornando true em caso afirmativo,
        // ou false em caso negativo
        for (int lin = 0; lin<3; lin++) {
            try {
                if (!this.tabDoJogo.haMarcaNaPosicao(lin, 0)) return false;
                if (!this.tabDoJogo.haMarcaNaPosicao(lin, 1)) return false;
                if (!this.tabDoJogo.haMarcaNaPosicao(lin, 2)) return false;
            }
            catch (Exception erro)
            {}
        }
    return true;
    }

    public boolean fimDeJogo ()
    {
        // se getMarcaDoVencedor != null,
        // retorna true
        // se tabuleiroCheio == true,
        // retorna true
        // caso contrario, retorna false
    }

    @Override
    public String toString ()
    {
        // faça
    }

    @Override
    public boolean equals (Object obj)
    {
        // retornar true se this for igual a obj ou false caso contrario
    }

    @Override
    public int hashCode () //feito
    {
        // faça
        int ret = 31;
        ret = ret * 31 + tabDoJogo.hashCode();
        if (ret<0) ret = -ret;
        return ret;
    }
}