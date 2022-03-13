public abstract class Participante
{
    protected IMediador mediador;
    
    public IMediador getMediador()
    {
        return this.mediador;
    }
    
    public void setMediador( IMediador a )
    {
        this.mediador = a;
    }
    
     public void comunicar(String mensaje)
    {
        this.getMediador().enviar(mensaje, this);
    }
    
    // Método a implementar por las clases que hereden
     public abstract void recibir(String mensaje);
}
