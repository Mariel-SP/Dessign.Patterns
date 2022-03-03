
public class Main
{
    public static void main(String[] args)
    {
         Fabrica fabrica = new Fabrica();
         System.out.println(" ");
         ILineaLigera linea1 = fabrica.getLine( "Azul" );
         ILineaLigera linea2 = fabrica.getLine( "Rojo" );
         ILineaLigera linea3 = fabrica.getLine( "Verde" );
         ILineaLigera linea4 = fabrica.getLine( "Morado" );
         ILineaLigera linea5 = fabrica.getLine( "Azul" );
        System.out.println(" ");

        linea1.dibujar( " Norte" ) ;
        linea2.dibujar( " Oeste" );
        linea3.dibujar( " Sur" );
        linea4.dibujar( " Este" );
        linea5.dibujar( " Norte" );
    }
}
