public class DriverMissing extends Driver
{
    public DriverMissing() {
    }
    
    @Override
     public void comprobar(String status)
    {
       if( status == null )
       {
           System.out.println("Solicitud pendiente");
       }
       else
       {
             if( this.getSiguiente() != null )
            {
                
                 this.getSiguiente().comprobar( status );
            }
       }
    }
}
