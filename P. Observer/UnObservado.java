public class UnObservado extends Observado
{
    private int numero = 0;
    
    public UnObservado() {
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
        
         NotifyObservers();
    }
}
