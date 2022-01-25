import java.util.ArrayList;
import java.util.List;

// Se inicia con la creación de un objeto al cual se le desarrollarán partes que lo construyen

public class CasaT {
    private List<String> CasaTitulo = null;

//Constructor de Casa con lista de opciones
    CasaT(){
        CasaTitulo = new ArrayList<String>();
    }

//Se inicia con las partes y los metodos para llevar acabo el patrón Builder
//Opciones que se podrán agregar a cada Modelo de casa segun la necesidad y gusto


//Añadir Titulos de casas
    public CasaT setPrincipal(){
        this.CasaTitulo.add("CASA: Modelo Principal");
        return CasaT.this;
    }

    public CasaT setAustero(){
        this.CasaTitulo.add("CASA: Modelo Austero");
        return CasaT.this;
    }

    public CasaT setEconomico(){
        this.CasaTitulo.add("CASA: Modelo Economico");
        return CasaT.this;
    }


//Imprimir diseño de casa
    public void PrintCasaT(){
        System.out.println(CasaTitulo);
    }

    public void PrintEspacio(){
        System.out.println(" ");
    }
}
