package jogo;
public class Marca
{
    private char simbolo;

    public Marca (char smb) throws Exception //feito
    {
        // validar smb, garantindo que ele
        // seja 'X' ou 'O' e coloca-lo em
        // simbolo
        // dar excecao em caso de valor invalido
        if (smb!='X' && smb!='O') throw new Exception ("Símbolo inválido");
        this.simbolo = smb;
    }

    public char getSimbolo () //feito
    {
        // retornar simbolo
        return this.simbolo;
    }

    @Override
    public String toString () // ele fez
    {
        return ""+simbolo;
    }

    @Override
    public boolean equals (Object obj) //feito
    {
        // retornar true se this for igual a obj ou false caso contrario
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Marca mrc = (Marca) obj;
        if (mrc.simbolo != this.simbolo) return false;
        return true;
    }

    @Override
    public int hashCode () //feito
    {
        // faça
        int ret = 31;
        ret = ret * 31 + ((Character) this.simbolo).hashCode();
        
        if (ret<0) ret = -ret;

        return ret;
    }
}