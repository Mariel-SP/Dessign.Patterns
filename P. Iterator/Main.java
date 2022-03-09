public class Main
{
    public static void main(String[] args)
    {
        try
        {
            
            Anexar agregado = new Anexar();
            
            Iterador iterador = agregado.getIterador();
            
            String obj = (String) iterador.inicial();
            System.out.println( "\n" + "Primer color" );
            System.out.println( obj );
            
            iterador.siguiente();
            iterador.siguiente();
            
            System.out.println( "\n" + "Tercer color" );
            System.out.println( (String) iterador.actual() + "\n" );
            
            iterador.inicial();
            
            System.out.println( "\n" + "Lista de colores" );

            while( iterador.posterior() == true ) {
                System.out.println( iterador.siguiente() );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}
