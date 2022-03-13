public abstract class Driver
{
    protected Driver nextDriver;
    
    public Driver getSiguiente() {
        return this.nextDriver;
    }
    
    public void setSiguiente(Driver driver) {
        this.nextDriver = driver;
    }
    
     public abstract void comprobar(String status);
}
