import java.util.ArrayList;
 
 public abstract class Observado
{
    private ArrayList<IObservador> observadores = new ArrayList<IObservador>();
    
    public Observado() {
    }
    
     public void AddObserver(IObservador o) {
      observadores.add(o);
    }
    
     public void DeleteObserver(IObservador o) {
        observadores.remove(o);
    }
    
     public void NotifyObservers()
    {
        
         for (IObservador obj : observadores) {
             obj.ObserverActualizado();
        }
    }
}
