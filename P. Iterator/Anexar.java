import java.util.Vector;

public class Anexar implements Agregado
{
     protected Vector aDatos = new Vector();
    
    public Anexar() {
        this.llenar();
    }
    
    @Override
     public Iterador getIterador()
    {
        return new IteradorConcreto( this );
    }
    
    public void llenar()
    {
        this.aDatos.add( new String("Rojo") );
        this.aDatos.add( new String("Azul") );
        this.aDatos.add( new String("Verde") );
        this.aDatos.add( new String("Amarillo") );
        this.aDatos.add( new String("Rosa") );
        this.aDatos.add( new String("Gris") );
    }
}