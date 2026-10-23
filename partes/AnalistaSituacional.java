package partes;

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
            Marca[] marcasLinha = new Marca[3];
            try {
                marcasLinha[0] = this.tabDoJogo.getMarcaNaPosicao(lin, 0);
                marcasLinha[1] = this.tabDoJogo.getMarcaNaPosicao(lin, 1);
                marcasLinha[2] = this.tabDoJogo.getMarcaNaPosicao(lin, 2);
            }
            catch (Exception erro)
            {}
            if (marcasLinha[0] != null && marcasLinha[1] != null && marcasLinha[3] != null) {
                if (marcasLinha[0].equals(marcasLinha[1]) && marcasLinha[1].equals(marcasLinha[2])) {
                    return marcasLinha[0];
                }
            }
        }
        for (int col = 0; col<3; col++) {
            Marca[] marcasCol = new Marca[3];
            try {
                marcasCol[0] = this.tabDoJogo.getMarcaNaPosicao(0, col);
                marcasCol[1] = this.tabDoJogo.getMarcaNaPosicao(1, col);
                marcasCol[2] = this.tabDoJogo.getMarcaNaPosicao(2, col);
            }
            catch (Exception erro)
            {}

            if (marcasCol[0] != null && marcasCol[1] != null && marcasCol[3] != null) {
                if (marcasCol[0].equals(marcasCol[1]) && marcasCol[1].equals(marcasCol[2])) {
                    return marcasCol[0];
                }
            }
        }

        Marca[] marcasDiag1 = new Marca[3];
        try {
            marcasDiag1[0] = this.tabDoJogo.getMarcaNaPosicao(0, 0);
            marcasDiag1[1] = this.tabDoJogo.getMarcaNaPosicao(1, 1);
            marcasDiag1[2] = this.tabDoJogo.getMarcaNaPosicao(2, 2);
        }
        catch (Exception erro)
        {}

        if (marcasDiag1[0] != null && marcasDiag1[1] != null && marcasDiag1[3] != null) {
            if (marcasDiag1[0].equals(marcasDiag1[1]) && marcasDiag1[1].equals(marcasDiag1[2])) {
                return marcasDiag1[0];
            }
        }
        
        Marca[] marcasDiag2 = new Marca[3];
        try {
            marcasDiag2[0] = this.tabDoJogo.getMarcaNaPosicao(0, 2);
            marcasDiag2[1] = this.tabDoJogo.getMarcaNaPosicao(1, 1);
            marcasDiag2[2] = this.tabDoJogo.getMarcaNaPosicao(2, 0);
        }
        catch (Exception erro)
        {}

        if (marcasDiag2[0] != null && marcasDiag2[1] != null && marcasDiag2[3] != null) {
            if (marcasDiag2[0].equals(marcasDiag2[1]) && marcasDiag2[1].equals(marcasDiag2[2])) {
                return marcasDiag2[0];
            }
        }

      return null;
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
        if (this.getMarcaDoVencedor() != null) return true;
        if (this.tabuleiroCheio() == true) return true;
        return false;
    }

    @Override
    public String toString ()
    {
        // faça
        String ret = "";
        if (!this.fimDeJogo()) {
            ret = "Situação: Jogo em andamento";
        }
        else {
            ret =   "Situação: Jogo finalizado" +
                    "\nMarca do vencedor: " + this.getMarcaDoVencedor();
        }
        return ret;
    }

    @Override
    public boolean equals (Object obj)
    {
        // retornar true se this for igual a obj ou false caso contrario
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        AnalistaSituacional a = (AnalistaSituacional) obj;
        if (!a.tabDoJogo.equals(this.tabDoJogo)) return false;
        return true;
    }

    @Override
    public int hashCode () //feito
    {
        // faça
        int ret = 31;
        ret = ret * 31 + this.tabDoJogo.hashCode();
        if (ret<0) ret = -ret;
        return ret;
    }
}