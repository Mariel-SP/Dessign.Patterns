public class IteradorConcreto implements Iterador
{
     private Anexar agregado;
     private int posicion_actual = 0;
    
    public IteradorConcreto( Anexar agregado )
    {
         this.agregado = agregado;
    }
    
    @Override
     public Object inicial()
    {
        Object obj = null;
        if( this.agregado.aDatos.isEmpty() == false )
        {
            this.posicion_actual = 0;
            obj = this.agregado.aDatos.firstElement();
        }
        return obj;
    }
    
    @Override
     public Object siguiente()
    {
        Object obj = null;
        if( (this.posicion_actual ) < this.agregado.aDatos.size() )
        {
            obj = this.agregado.aDatos.elementAt(this.posicion_actual);
            this.posicion_actual = this.posicion_actual + 1;
        }
        return obj;
    }
    
    @Override
     public boolean posterior()
    {
        boolean ok = false;
        if( this.posicion_actual < (this.agregado.aDatos.size() ) )
        {
            ok = true;
        }
        return ok;
    }
    
    @Override
     public Object actual()
    {
        Object obj = null;
        if( this.posicion_actual < this.agregado.aDatos.size() )
        {
            obj = this.agregado.aDatos.elementAt( this.posicion_actual );
        }
        return obj;
    }
}
