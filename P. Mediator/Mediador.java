import java.util.ArrayList;

public class Mediador implements IMediador
{
    private ArrayList<Participante> participantes;
    
    public Mediador()
    {
        this.participantes = new ArrayList<Participante>();
    }
    
     public void agregarParticipante(Participante participante)
    {
        this.participantes.add( participante );
    }
    
    @Override
     public void enviar(String mensaje, Participante originator)
    {
        for( Participante participante : participantes )
        {
            if( participante != originator )
            {
                participante.recibir( mensaje );
            }
        }
    }
}
