public class Main {
    public static void main(String[] args)
    {
        
        System.out.println(" ");
        Carpeta c1 = new Carpeta("Carpeta Principal");
        c1.insertarNodo( new Archivo("Archivo 1") );
        c1.insertarNodo( new Archivo("Archivo 2") );
        c1.insertarNodo( new Archivo("Archivo 3") );
        

        Carpeta c2 = new Carpeta("Carpeta Secundaria");
        c2.insertarNodo( new Archivo("Archivo 4") );
        c2.insertarNodo( new Archivo("Archivo 5") );
        
        
        c1.insertarNodo( c2 );
        
        c1.insertarNodo( new Archivo("Archivo 6") );
        c1.mostrar();
        System.out.println(" ");
        
        c1.eliminarNodo( c2 );
        c1.mostrar();
        System.out.println(" ");
        System.out.println("Se modifico la Ruta del Archivo 6 ");
        System.out.println(" ");
    }
}
