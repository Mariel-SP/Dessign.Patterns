public class Avion extends Participante
{
    public Avion(IMediador a) {
        this.setMediador( a );
    }
    
    @Override
     public void recibir(String mensaje)
    {
        System.out.println( "Avión: " + mensaje );
    }
}
