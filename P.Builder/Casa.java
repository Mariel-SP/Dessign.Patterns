import java.util.ArrayList;
import java.util.List;

// Se inicia con la creación de un objeto al cual se le desarrollarán partes que lo construyen

public class Casa {
    private List<String> CasaBuilder = null;

//Constructor de Casa con lista de opciones
    Casa(){
        CasaBuilder = new ArrayList<String>();
    }

//Se inicia con las partes y los metodos para llevar acabo el patrón Builder
//Opciones que se podrán agregar a cada Modelo de casa segun la necesidad y gusto


//Añadir Cocina
    public Casa setCocina(){
        this.CasaBuilder.add("Cocina");
        return Casa.this;
    }
//Añadir Cuarto de Lavado
    public Casa setCuartoLavado(){
        this.CasaBuilder.add("Cuarto de Lavado");
        return Casa.this;
    }
//Añadir Cuarto Principal
    public Casa setCuartoPrincipal(){
        this.CasaBuilder.add("Cuarto Principal");
        return Casa.this;
    }
//Añadir Cuarto de Visitas
    public Casa setCuartoVisitas(){
        this.CasaBuilder.add("Cuarto de Visitas");
        return Casa.this;
    }
//Añadir Cuarto de Juegos
    public Casa setCuartoJuegos(){
        this.CasaBuilder.add("Cuarto de Juegos");
        return Casa.this;
    }
//Añadir Sala
    public Casa setSala(){
        this.CasaBuilder.add("Sala");
        return Casa.this;
    }
//Añadir Comedor
    public Casa setComedor(){
        this.CasaBuilder.add("Comedor");
        return Casa.this;
    }

//Imprimir diseño de casa
    public void PrintCasa(){
        System.out.println(CasaBuilder);
    }

    public void PrintTituloCasa(){
        System.out.println("Resultado de casa");
    }

    public void PrintEspacio(){
        System.out.println(" ");
    }
}