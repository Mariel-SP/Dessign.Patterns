public class UnObservador implements IObservador
{
    private UnObservado objObservado;
    
     public UnObservador( UnObservado objObservado ) {
        this.objObservado = objObservado;
         objObservado.AddObserver(this);
    }
    
    @Override
     public void ObserverActualizado() {
       System.out.println("El objeto Observado se modifico y ahora es:  " + this.objObservado.getNumero());
    }
}
