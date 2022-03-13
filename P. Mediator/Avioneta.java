public class Avioneta extends Participante
{
    public Avioneta(IMediador a) {
        this.setMediador( a );
    }
    
    @Override
     public void recibir(String mensaje)
    {
        System.out.println( "Avioneta: " + mensaje );
    }
}
