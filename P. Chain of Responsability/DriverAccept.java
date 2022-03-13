public class DriverAccept extends Driver
{
    public DriverAccept() {
    }
    
    @Override
     public void comprobar(String status)
    {
       if( (status != null) && (status.equalsIgnoreCase("APROBADO") == true) )
       {
           System.out.println("Solicitud aprobada");
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
