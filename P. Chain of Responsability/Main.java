public class Main
{
    public static void main(String[] args)
    {
        Driver driver1 = new DriverAccept();
        Driver driver2 = new DriverReject();
        Driver driver3 = new DriverMissing();

        driver1.setSiguiente( driver2 );
        driver2.setSiguiente( driver3 );
        
        driver1.comprobar("APROBADO");
        driver1.comprobar("APROBADO");
        driver1.comprobar("DENEGADO");
        driver1.comprobar(null);
        driver1.comprobar("DENEGADO");
    }
}
