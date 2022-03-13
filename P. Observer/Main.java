public class Main
{
    public static void main(String[] args)
    {
        
         UnObservado objObservado = new UnObservado();
        
         new UnObservador( objObservado );
         objObservado.setNumero(55);
         new UnObservador( objObservado );
         objObservado.setNumero(50);
         new UnObservador( objObservado );
         objObservado.setNumero(57);
         new UnObservador( objObservado );
         objObservado.setNumero(59);
    }
}
