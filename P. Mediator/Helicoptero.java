public class Helicoptero extends Participante
{
    public Helicoptero(IMediador a) {
        this.setMediador( a );
    }
    
    @Override
     public void recibir(String mensaje)
    {
        System.out.println( "Helicoptero: " + mensaje );
    }
}
