package jogo;
public class Tabuleiro implements Cloneable
{
    // a principio, toda igual a null
    private Marca matriz [][] = new Marca [3][3];

    public boolean haMarcaNaPosicao (int lin, int col) throws Exception //feito
    {
        if (lin < 0 || lin > 2) throw new Exception("Linha inválida");
        if (col < 0 || col > 2) throw new Exception("Coluna inválida");
        if (this.matriz[lin][col] == null) return false;
        return true;
        // verifico se em matriz[lin][col]
        // tem null, retornando false em caso
        // afirmativo, ou true em caso negativo
        // dar excecao caso lin ou col invalido
    }

    public Marca getMarcaNaPosicao (int lin, int col) throws Exception //feito
    {
        if (lin < 0 || lin > 2) throw new Exception("Linha inválida");
        if (col < 0 || col > 2) throw new Exception("Coluna inválida");
        return this.matriz[lin][col];
        // retornar a marca que tem em
        // matriz[lin][col]
        // dar excecao caso lin ou col invalido
    }

    public void setMarcaNaPosicao (Marca mrc, int lin, int col) throws Exception
    {
        if (lin < 0 || lin > 2) throw new Exception("Linha inválida");
        if (col < 0 || col > 2) throw new Exception("Coluna inválida");
        if (mrc == null) throw new Exception("Marca ausente");
        this.matriz[lin][col] = mrc;
        // colocar mrc em matriz[lin][col],
        // dar excecao caso lin ou col invalido
        // dar excecao caso mrc seja null
    }

    @Override
    public String toString ()
    {
        return matriz[0][0] + " | " +matriz[0][1] + " | " + matriz[0][2] + "\n" +
               "__|___|__\n" +
               matriz[1][0] + " | " +matriz[1][1] + " | " + matriz[1][2] + "\n" +
               "__|___|__\n" +
               matriz[2][0] + " | " +matriz[2][1] + " | " + matriz[2][2] + "\n" +
               "  |   |  ";
        // retornar em um String o tabuleiro
        // formatado para ser exibido na tela
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Tabuleiro t = (Tabuleiro)obj;
        for(byte posCol = 0; posCol<3; posCol++){
            for (byte posLin = 0; posLin<3; posLin++){
                if(t.matriz[posLin][posCol] != this.matriz[posLin][posCol]) return false;
            }
        }
        return true;
        // retornar true se this for igual a obj ou false caso contrario
    }

    @Override
    public int hashCode ()
    {
        int ret = 7;
        for(byte posCol = 0; posCol<3; posCol++){
            for (byte posLin = 0; posLin<3; posLin++){
                ret = ret * 31 + (this.matriz[posLin][posCol]).hashCode();
            }
        }
        return ret;
        // faça
    }

    // construtor de copia
    public Tabuleiro (Tabuleiro modelo) throws Exception
    {
        if (modelo == null) throw new Exception("Modelo ausente");
        for(byte posCol = 0; posCol<3; posCol++){
            for (byte posLin = 0; posLin<3; posLin++){
                this.matriz[posLin][posCol] = modelo.matriz[posLin][posCol];
            }
        }
        // faça
    }

    @Override
    public Object clone ()
    {
        Object ret = null;
        try{
            ret = new Tabuleiro(this);
        } catch (Exception e){}
        return ret;
        // faça
    }
}
