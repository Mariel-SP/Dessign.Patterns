public class Main
{
    public static void main(String[] args)
    {
        // Crear el mediador de la comunicación
         Mediador a = new Mediador();

        // Crear los objetos participantes
        Participante p1 = new Avioneta( a );
        Participante p2 = new Helicoptero( a );
        Participante p3 = new Avion( a );

        // Agregarlos al objeto mediador
         a.agregarParticipante( p1 );
         a.agregarParticipante( p2 );
         a.agregarParticipante( p3 );

        // Provocar un cambio en un uno de los elementos
        p2.comunicar("Helicoptero se encuentra en la torre de control");
    }
}
