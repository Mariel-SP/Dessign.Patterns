public class DriverReject extends Driver
{
    public DriverReject() {
    }
    
    @Override
     public void comprobar(String status)
    {
       if( (status != null) && (status.equalsIgnoreCase("DENEGADO") == true) )
       {
           System.out.println("Solicitud denegada");
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
