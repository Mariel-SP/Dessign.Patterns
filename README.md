# Dessign.Patterns
Patrones de Diseño - Desarrollo de Software

## Patrón de diseño Builder 

Como patrón de diseño, el patrón builder (Constructor) se usa para permitir la creación de una variedad de objetos complejos desde un objeto fuente, el objeto fuente se compone de una variedad de partes que contribuyen individualmente a la creación de cada objeto complejo a través de un conjunto de llamadas secuenciales a una implementación específica que extienda la clase Abstract Builder. Así, cada implementación existente de Abstract Builder construirá un objeto complejo Producto de una forma diferente deseada. El patrón builder es creacional. A menudo, el patrón builder construye el patrón Composite, un patrón estructural. (Builder (patrón de diseño))

Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción. Normalmente, este patrón se incorpora para evitar un “constructor telescópico”; es decir, sobrecargamos el constructor y creamos varias versiones más cortas con menos parámetros. Estos constructores siguen recurriendo al principal, pasando algunos valores por defecto a cualquier parámetro omitido. (Refactoring)


### Aplicabilidad
•	Utiliza el patrón Builder cuando quieras que el código sea capaz de crear distintas representaciones de ciertos productos (por ejemplo, casas de piedra y madera).

•	El patrón Builder se puede aplicar cuando la construcción de varias representaciones de un producto requiera de pasos similares que sólo varían en los detalles.

•	Utiliza el patrón Builder para construir árboles con el patrón Composite u otros objetos complejos.

•	El patrón Builder te permite construir productos paso a paso. Podrás aplazar la ejecución de ciertos pasos sin descomponer el producto final. 

### Ventajas
•	Puedes construir objetos paso a paso, aplazar pasos de la construcción o ejecutar pasos de forma recursiva.

•	Puedes reutilizar el mismo código de construcción al construir varias representaciones de productos.

•	Principio de responsabilidad única. Puedes aislar un código de construcción complejo de la lógica de negocio del producto.

### Analogía en el mundo real
![image](https://user-images.githubusercontent.com/81381529/157147954-fa198153-5502-4961-895f-6bcf32d6a159.png)

### Estructura
![image](https://user-images.githubusercontent.com/81381529/157148007-d8b52512-c87b-4e8d-8b8f-3da023345549.png)

## Código 
### Builder.java
```
{
  public class Builder {
    public static void main(String[] args){

        CasaT TituloPrincipal = new CasaT();
        TituloPrincipal.PrintEspacio();
        TituloPrincipal.setPrincipal();
        TituloPrincipal.PrintCasaT();

        Casa ModeloPrincipal = new Casa();
        ModeloPrincipal.setCocina().setCuartoLavado().setCuartoPrincipal().setCuartoVisitas().setComedor().setCuartoJuegos().setCuartoJuegos().setSala();
        ModeloPrincipal.PrintEspacio();
        ModeloPrincipal.PrintCasa();
        ModeloPrincipal.PrintEspacio();
        ModeloPrincipal.PrintEspacio();

        CasaT TituloAustero = new CasaT();
        TituloAustero.PrintEspacio();
        TituloAustero.setAustero();
        TituloAustero.PrintCasaT();

        Casa ModeloAustero = new Casa();
        ModeloAustero.setCocina().setCuartoLavado().setCuartoPrincipal().setCuartoVisitas().setComedor().setSala();
        ModeloAustero.PrintEspacio();
        ModeloAustero.PrintCasa();
        ModeloPrincipal.PrintEspacio();
        ModeloPrincipal.PrintEspacio();

        CasaT TituloEconomico = new CasaT();
        TituloEconomico.PrintEspacio();
        TituloEconomico.setEconomico();
        TituloEconomico.PrintCasaT();

        Casa ModeloEconomico = new Casa();
        ModeloEconomico.setCocina().setCuartoPrincipal().setComedor().setSala();
        ModeloEconomico.PrintEspacio();
        ModeloEconomico.PrintCasa();
        ModeloEconomico.PrintEspacio();
        ModeloEconomico.PrintEspacio();

    }
  }
```

### Casa.java
```
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<String> CasaBuilder = null;

    Casa(){
        CasaBuilder = new ArrayList<String>();
    }

    public Casa setCocina(){
        this.CasaBuilder.add("Cocina");
        return Casa.this;
    }
  
    public Casa setCuartoLavado(){
        this.CasaBuilder.add("Cuarto de Lavado");
        return Casa.this;
    }
  
    public Casa setCuartoPrincipal(){
        this.CasaBuilder.add("Cuarto Principal");
        return Casa.this;
    }

    public Casa setCuartoVisitas(){
        this.CasaBuilder.add("Cuarto de Visitas");
        return Casa.this;
    }

    public Casa setCuartoJuegos(){
        this.CasaBuilder.add("Cuarto de Juegos");
        return Casa.this;
    }

    public Casa setSala(){
        this.CasaBuilder.add("Sala");
        return Casa.this;
    }

    public Casa setComedor(){
        this.CasaBuilder.add("Comedor");
        return Casa.this;
    }

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
```
 ### CasaT.java
```
import java.util.ArrayList;
import java.util.List;

public class CasaT {
    private List<String> CasaTitulo = null;

    CasaT(){
        CasaTitulo = new ArrayList<String>();
    }

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
  
    public void PrintCasaT(){
        System.out.println(CasaTitulo);
    }

    public void PrintEspacio(){
        System.out.println(" ");
    }
}
```
## Patrón de diseño Factory Method

El patrón de diseño Factory Method nos permite la creación de un subtipo determinado por medio de una clase de Factoría, la cual oculta los detalles de creación del objeto. El objeto real creados es enmascarado detrás de una interface común entre todos los objetos que pueden ser creado, con la finalidad de que estos pueden variar sin afectar la forma en que el cliente interactúa con ellos. Es normal que un Factory pueda crear varios subtipos de una determinada interface y que todos los objetos concretos fabricados hagan una tarea similar, pero con detalles de implementación diferentes. (Factory)

La intención del Factory Method es tener una clase a la cual delegar la responsabilidad de la creación de los objetos, para que no sea el mismo programador el que decida que clase instanciará, si no que delegará esta responsabilidad al Factory confiando en que este le regresará la clase adecuada para trabajar. (Source Making)
 

### Estructura

Se enlistan los componentes que conforman el patrón de diseño: 

• IProduct: Representa de forma abstracta el objeto que queremos crear, mediante esta interface se definen la estructura que tendrá el objeto creado. 

• Concrete Product: Representa una implementación concreta de la interface IProduct, la cual es creada a través del Concrete Factory. 

• Abstract Factory: Este componente puede ser opcional, sin embargo, se recomienda la creación de un Abstract Factory que define el comportamiento por default de los Concrete Factory. 

• Concrete Factory: Representa una fábrica concreta la cual es utilizada para la creación de los Concrete Product, esta clase hereda el comportamiento básico del Abstract Factory

### Aplicabilidad

•	Utiliza el Método Fábrica cuando no conozcas de antemano las dependencias y los tipos exactos de los objetos con los que deba funcionar tu código.

•	Utiliza el Factory Method cuando quieras ofrecer a los usuarios de tu biblioteca o framework, una forma de extender sus componentes internos.

•	Utiliza el Factory Method cuando quieras ahorrar recursos del sistema mediante la reutilización de objetos existentes en lugar de reconstruirlos cada vez.

•	El patrón Factory Method separa el código de construcción de producto del código que hace uso del producto. Por ello, es más fácil extender el código de construcción de producto de forma independiente al resto del código.

### Analogía en el mundo real
![image](https://user-images.githubusercontent.com/81381529/157149923-bd102f67-06a2-4623-b5c1-31fb3ab0968d.png)

### Estructura
![image](https://user-images.githubusercontent.com/81381529/157149948-f1826c8e-9459-4d0b-8761-666d6b223421.png)

## Código 
### Main.py
```
from Restaurante import Restaurante_Chino,Restaurante_Americano, Restaurante_Universal


restaurante_a = Restaurante_Chino()
Platillo=restaurante_a.crearPlatillo()
Platillo.Plato();

restaurante_b = Restaurante_Americano()
Platillo=restaurante_b.crearPlatillo()
Platillo.Plato();

restaurante_c = Restaurante_Universal()
Platillo=restaurante_c.crearPlatillo()
Platillo.Plato();
```
### Comida.py
```
from abc import abstractclassmethod

class Comida:
    @abstractclassmethod
    def Plato():
        pass

class Comida_China(Comida):
    @staticmethod
    def Plato():
        print("Sopa Wan Tan")

class Comida_Americana(Comida):
    @staticmethod
    def Plato():
        print("Apple pie")
```

### Restaurante.py
```
from abc import abstractclassmethod
import random

from Comida import Comida_China, Comida_Americana, Comida

class Restaurante:
    @abstractclassmethod
    def crearPlatillo():
        pass

class Restaurante_Chino(Restaurante):
    @staticmethod
    def crearPlatillo():
        Plato1=Comida_China()
        return Plato1

class Restaurante_Americano(Restaurante):
    @staticmethod
    def crearPlatillo():
        Plato1=Comida_Americana()
        return Plato1

class Restaurante_Universal(Restaurante):
    @staticmethod
    def crearPlatillo():
        Eleccion=random.randint(0, 1)
        if Eleccion==1:
            Plato1=Comida_Americana()
            return Plato1
        else:
            Plato1=Comida_China()
            return Plato1 
```

## Patrón de diseño Factory Method

Prototype es un patrón de diseño creacional que permite la clonación de objetos, incluso los complejos, sin acoplarse a sus clases específicas. Prototype nos permite copiar objetos existentes sin que el código dependa de sus clases.
Todas las clases prototipo deben tener una interfaz común que haga posible copiar objetos incluso si sus clases concretas son desconocidas. Los objetos prototipo pueden producir copias completas, ya que los objetos de la misma clase pueden acceder a los campos privados de los demás. (Prototype)
La manera de funcionar de este diseño es la siguiente, el patrón Prototype delega el proceso de clonación a los propios objetos que están siendo clonados. El patrón declara una interfaz común para todos los objetos que soportan la clonación. Esta interfaz nos permite clonar un objeto sin acoplar el código a la clase de ese objeto. Normalmente, dicha interfaz contiene un único método clonar. 

El patrón Prototype proporciona al código cliente una interfaz general para trabajar con todos los objetos que soportan la clonación. Esta interfaz hace que el código cliente sea independiente de las clases concretas de los objetos que clona. (Programacion.net)
Por su parte, dicho patrón te permite utilizar como prototipos un grupo de objetos prefabricados, configurados de maneras diferentes.
En lugar de instanciar una subclase que coincida con una configuración, el cliente puede, sencillamente, buscar el prototipo adecuado y clonarlo.

### Aplicabilidad
•	Utiliza el patrón Prototype cuando tu código no deba depender de las clases concretas de objetos que necesites copiar.

•	Utiliza el patrón cuando quieras reducir la cantidad de subclases que solo se diferencian en la forma en que inicializan sus respectivos objetos. Puede ser que alguien haya creado estas subclases para poder crear objetos con una configuración específica.

### Ventajas
•	Puedes clonar objetos sin acoplarlos a sus clases concretas.

•	Puedes evitar un código de inicialización repetido clonando prototipos prefabricados.

•	Puedes crear objetos complejos con más facilidad.

•	Obtienes una alternativa a la herencia al tratar con pre-ajustes de configuración para objetos complejos.

### Analogía en el mundo real
![image](https://user-images.githubusercontent.com/81381529/157150610-97e45fd9-169f-4401-92d3-383bac675ca6.png)

### Estructura
![image](https://user-images.githubusercontent.com/81381529/157150624-534e1811-0b22-4a5a-a9ef-5b66a90ecef8.png)

## Código 
### Main.py
```
from Figure import Silueta

Shape=Silueta(3)
Oval = Shape.Clone(Shape)

if Oval != None:
    print(Oval.getColor())
    print(Oval.getNum())

print(Oval==Shape)
```

### Figure.py
```
from abc import abstractclassmethod
import copy


class Figure:
    @abstractclassmethod
    def Clone():
        pass

class Silueta(Figure):
    Color = ''
    Number = 0.0

    def __init__(self, Number):
        self.Color="Red"
        self.Number=3
    
    @staticmethod
    def Clone(Form):
        newForm = copy.deepcopy(Form)
        return newForm
    
    def getColor(self):
        return self.Color
    
    def getNum(self):
        return self.Number
```

## Patrón de diseño Abstract Factory

El patrón de diseño Abstract Factory busca agrupar un conjunto de clases que tiene un funcionamiento en común llamadas familias. Estas familias son creadas mediante una sucesión denominada Factory; este patrón es especialmente útil cuando requerimos tener ciertas familias de clases para resolver un problema, sin embargo, puede que se requieran crear implementaciones paralelas de estas clases para resolver el mismo problema, pero con una implementación distinta. (Abstract Factory)
Este patrón atribuye su funcionalidad a una fábrica abstracta; es decir, se puede definir como un patrón de diseño para el desarrollo de software. Es relevante, ya que se encarga de proveer una interfaz para crear familias de objetos relacionados o dependientes entre ellos sin especificar una clase en concreto. (Patrón de diseño creacional)
Normalmente, este patrón se implementa de manera que se adquiera como una herramienta de desarrollo; debe ser capaz de facilitar la creación de diferentes objetos, todos pertenecientes a la misma familia. 

El propósito de la Fábrica Abstracta es proveer una interface para la creación de familias de objetos relacionados, sin especificar clases concretas. En otras palabras, este patrón forma parte de los patrones denominados creacionales, ya que son los encargados de proporcionar varios mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización del código existente. (Línea de Código, 2013)
Dentro de este patrón, se busca implementar diversas familias de un mismo ejemplo, para poder brindar un conjunto de opciones de la misma gama a un mismo producto que se realice en base a estos elementos que posteriormente te darán la posibilidad de generar una variable mediante los artículos esenciales. 


### Estructura

Para comprender mejor cómo funciona este patrón debemos analizar cada componente: 

• Client: Representa la persona o evento que dispara la ejecución del patrón. 

• Abstract Product (A, B): Interfaces que definen la estructura de los objetos para crear familias. 

• Concrete Product (A, B): Clases que heredan de Abstract Product con el fin de implementar familias de objetos concretos.

• Concrete Factory: Representan las fábricas concretas que servirán para crear las instancias de todas las clases de la familia. En esta clase debe existir un método para crear cada una de las clases de la familia. 

• Abstract Factory: Define la estructura de las fábricas y deben proporcionar un método para cada clase de la familia.

### Analogía en el mundo real
![image](https://user-images.githubusercontent.com/81381529/157151355-40e3520e-7d00-4d1f-95ec-cd5d86f65d5b.png)

### Estructura
![image](https://user-images.githubusercontent.com/81381529/157151370-8c79241c-eefb-4b6d-8d35-33e42a5e7666.png)

## Código 
### Main.py
```
import Pizza
import Pizzeria

Pizzeria_Norte = Pizzeria.Pizza_Sencilla()
Pizzeria_Centro = Pizzeria.Pizza_Doble()
Pizzeria_Sur = Pizzeria.Pizza_Especial()

Pizza_Uno = Pizza.Pizza()
Pizza_Dos = Pizza.Pizza()
Pizza_Tres = Pizza.Pizza()


print()
print("Pizza Sencilla")

Pizza_Uno.Salsa = Pizzeria_Norte.CreateSalsa()
Pizza_Uno.Queso = Pizzeria_Norte.CreateQueso()
Pizza_Uno.Carne = Pizzeria_Norte.CreateCarne()

Pizza_Uno.Salsa.Print()
Pizza_Uno.Queso.Print()
Pizza_Uno.Carne.Print()


print()
print("Pizza Doble")

Pizza_Dos.Salsa = Pizzeria_Centro.CreateSalsa()
Pizza_Dos.Queso = Pizzeria_Centro.CreateQueso()
Pizza_Dos.Carne = Pizzeria_Centro.CreateCarne()

Pizza_Dos.Salsa.Print()
Pizza_Dos.Queso.Print()
Pizza_Dos.Carne.Print()


print()
print("Pizza Especial")

Pizza_Tres.Salsa = Pizzeria_Sur.CreateSalsa()
Pizza_Tres.Queso = Pizzeria_Sur.CreateQueso()
Pizza_Tres.Carne = Pizzeria_Sur.CreateCarne()

Pizza_Tres.Salsa.Print()
Pizza_Tres.Queso.Print()
Pizza_Tres.Carne.Print()

print()
```

### Ingredientes.py
```
from abc import abstractclassmethod

class Salsa:
    @abstractclassmethod
    def Print():
        pass

class Tomate(Salsa):
    @staticmethod
    def Print():
        print("Salsa de Tomate")

class Tomate_Albahaca(Salsa):
    @staticmethod
    def Print():
        print("Salsa de Tomate con Albahaca")

class Tomate_Albahaca_Perejil(Salsa):
    @staticmethod
    def Print():
        print("Salsa de Tomate con Albahaca y Perejil")

class Queso:
    @abstractclassmethod
    def Print():
        pass

class Mozzarella(Queso):
    @staticmethod
    def Print():
        print("Queso Mozzarella")

class Mozzarella_Gouda(Queso):
    @staticmethod
    def Print():
        print("Queso Mozzarella y Gouda")

class Cuatro_Quesos(Queso):
    @staticmethod
    def Print():
        print("Queso Crema, Mozzarella, Gouda y Manchego")

class Carne:
    @abstractclassmethod
    def Print():
        pass

class Pepperoni(Carne):
    @staticmethod
    def Print():
        print("Pepperoni")

class Salami(Carne):
    @staticmethod
    def Print():
        print("Salami")

class Salami_Pepperoni(Carne):
    @staticmethod
    def Print():
        print("Pepperoni y Salami")
```


### Pizza.py
```
from Ingredientes import Carne, Queso, Salsa
from Pizzeria import Pizza_Doble, Pizza_Especial, Pizza_Sencilla


class Pizza:

    Salsa = None
    Queso = None
    Carne = None

    def __init__(self) -> None:
        pass
```

### Pizzeria.py
```
from abc import abstractclassmethod
import Ingredientes

class Abstract_Factory:
    
    @abstractclassmethod
    def CreateSalsa():
        pass

    @abstractclassmethod
    def CreateQueso():
        pass

    @abstractclassmethod
    def CreateCarne():
        pass

class Pizza_Sencilla(Abstract_Factory):

    @staticmethod
    def CreateSalsa():
        return Ingredientes.Tomate()

    @staticmethod
    def CreateQueso():
        return Ingredientes.Mozzarella()

    @staticmethod
    def CreateCarne():
        return Ingredientes.Pepperoni()

class Pizza_Doble(Abstract_Factory):

    @staticmethod
    def CreateSalsa():
        return Ingredientes.Tomate_Albahaca()

    @staticmethod
    def CreateQueso():
        return Ingredientes.Mozzarella_Gouda()

    @staticmethod
    def CreateCarne():
        return Ingredientes.Salami()

class Pizza_Especial(Abstract_Factory):

    @staticmethod
    def CreateSalsa():
        return Ingredientes.Tomate_Albahaca_Perejil()

    @staticmethod
    def CreateQueso():
        return Ingredientes.Cuatro_Quesos()
        
    @staticmethod
    def CreateCarne():
        return Ingredientes.Salami_Pepperoni()
```
## Patrón de diseño Proxy

El patrón Proxy es un patrón estructural que tiene como propósito proporcionar un subrogado o intermediario de un objeto para controlar su acceso. Un proxy, en su forma más general, es una clase que funciona como una interfaz para otra cosa. El patrón proxy trata de proporcionar un objeto intermediario que represente o sustituya al objeto original con motivo de controlar el acceso y otras características de este. (Pattern Proxy)
Este modelo es un patrón de diseño estructural que te permite proporcionar un sustituto o marcador de posición para otro objeto. Un proxy controla el acceso al objeto original, permitiéndote hacer algo antes o después de que la solicitud llegue al objeto original. (Proxy)

El patrón Proxy sugiere que crees una nueva clase proxy con la misma interfaz que un objeto de servicio original. Después actualizas tu aplicación para que pase el objeto proxy a todos los clientes del objeto original. (Refactoring)Al recibir una solicitud de un cliente, el proxy crea un objeto de servicio real y le delega todo el trabajo. Considero que la finalidad de este patrón es ser capaz de poder usarse cuando se necesita una referencia a un objeto más flexible o sofisticada que un puntero. 
Un objeto proxy podemos definirlo como un objeto que agrega lógica adicional por encima del objeto que está siendo aproximado sin necesidad de modificar el código del objeto aproximado. Un objeto proxy tiene los mismos métodos públicos que el objeto aproximado y debería ser lo más posible indistinguible. Cuando un método es invocado en el objeto proxy, el código adicional es usualmente ejecutado antes y/o después de ser ejecutado el método en el objeto aproximado. (Proxy Pattern)

Lo que me gustaría resaltar es lo que aporta este patrón; esto sería resguardar ciertos datos por temas de seguridad o por ser costosa la búsqueda de estos. 
Como también, este patrón tiene la capacidad de preparar un ambiente antes de hacer la petición. Es decir, cuando se necesita cubrir el objeto real para manipular las peticiones y accionar previo a la petición al objeto real. 
Una de las principales ventajas es la seguridad que tenemos de que el estado de este se modifica a través del proxy. Gestiona los objetos que consumen muchos recursos y, al hacer ese manejo, evita que haya muchas instancias de estos.

### Funcionalidades
Por su parte, el patrón de diseño Proxy tiene una amplia gama de funcionalidades y considero que podemos implementarlo en algunos escenarios tales como: 

• Controlar el acceso a otro objeto 

• Para procesos de inicialización diferida de un objeto 

• Implementación de funciones de logging 

• Implementar operaciones de facilitación de conexiones de redes 

• Conteo de referencias a objetos 

### Analogía en el mundo real
![image](https://user-images.githubusercontent.com/81381529/157151964-5ac74473-b32e-4003-9d1a-1f978a329445.png)

### Estructura
![image](https://user-images.githubusercontent.com/81381529/157151984-50f39cf6-32f3-4fb3-be40-b12a4f551fb2.png)

## Código 
### Main.py
```
from tkinter.messagebox import YES
import Pizza
import Pizzeria

Pizza_Nueva_Especial = Pizza.pizza()

New_Pizza = Pizzeria.Pizza_Especial()

New_Pizza.Cambio_pizza(New_Pizza , Pizza_Nueva_Especial , "Agregar")
New_Pizza.Nueva_pizza(New_Pizza,Pizza_Nueva_Especial)

New_Pizza.Cambio_pizza(New_Pizza , Pizza_Nueva_Especial , "No agregar")
New_Pizza.Nueva_pizza(New_Pizza , 
Pizza_Nueva_Especial)
```
### Pizza.py
```
class pizza:

    def __init__(self,pizza_uno='pizza'):
        self.Nuevo = pizza_uno


    def setNueva_Pizza(self,new):
        self.Nuevo = new
    

    def Nueva_pizza(self):
        return self.Nuevo
```
### Pizzeria.py
```

from abc import abstractclassmethod
import Pizza

class Pizza_Nueva:

    @abstractclassmethod
    def Cambio_pizza(Pizza_demo , Clave):
        pass

    @abstractclassmethod
    def Nueva_pizza(Pizza_demo):
        pass

class Pizza_Sencilla(Pizza_Nueva):

    @staticmethod
    def Cambio_pizza(Pizza_demo , Clave):
        if Clave == "No agregar":
            Pizza_demo.setNueva_Pizza("Sin ingredientes agregados")
        else:
            Pizza_demo.setNueva_Pizza("Nuevos ingredientes agregados")
        return Pizza_demo

    @staticmethod
    def Nueva_pizza(Pizza_demo):
        print(Pizza_demo.Nueva_pizza())

class Pizza_Especial(Pizza_Nueva):

    Pizza_original = None 

    @staticmethod
    def Cambio_pizza(self , Pizza_demo , Clave):
        if self.Pizza_original == None:
            self.Pizza_original = Pizza_Sencilla()
            return self.Pizza_original.Cambio_pizza(Pizza_demo , Clave)
        else:
            return self.Pizza_original.Cambio_pizza(Pizza_demo , Clave)

    @staticmethod
    def Nueva_pizza(self , Pizza_demo):
        if self.Pizza_original == None:
            self.Pizza_original = Pizza_Sencilla()
            self.Pizza_original.Cambio_pizza(Pizza_demo)
        else:
            self.Pizza_original.Nueva_pizza(Pizza_demo)
```

## Patrón de diseño Decorator

Decorator es un patrón de diseño estructural que permite añadir dinámicamente nuevos comportamientos a objetos colocándolos dentro de objetos especiales que los envuelven. Utilizando decoradores puedes envolver objetos innumerables veces, ya que los objetos objetivo y los decoradores siguen la misma interfaz. El objeto resultante obtendrá un comportamiento de apilado de todos los wrappers. (Refact)
El patrón Decorator es bastante común en el código Python, especialmente en el código relacionado con los flujos. El patrón de diseño Decorador es una estrategia de diseño revelada en 1994 para expandir la funcionalidad de las clases dinámicamente en el software de computación orientado a objetos. Según este patrón, cualquier objeto puede complementarse con un comportamiento deseado sin influir en las funcionalidades de otros objetos de la misma clase. Desde el punto de vista estructural, el patrón Decorador tiene mucho en común con el patrón Cadena de Responsabilidad, aunque, en contraste con este, con un procesador central, todas las clases reciben las peticiones. (Ionos)
El componente de software que hay que ampliar se “decora” con una o más clases decoradoras, que lo envuelven completamente, siguiendo el patrón de diseño Decorador. Cada decorador es del mismo tipo que el componente al que envuelve y, por lo tanto, tiene la misma interfaz. De esta manera, las llamadas de método entrantes pueden delegarse fácilmente al componente adjunto mientras lleva a cabo una funcionalidad. Las llamadas también pueden procesarse dentro del decorador. 

El patrón Decorator responde a la necesidad de añadir dinámicamente funcionalidad a un Objeto. Esto nos permite no tener que crear sucesivas clases que hereden de la primera incorporando la nueva funcionalidad, sino otras que la implementan y se asocian a la primera. (Decorator) 
El patrón Decorator te permite estructurar tu lógica de negocio en capas, crear un decorador para cada capa y componer objetos con varias combinaciones de esta lógica, durante el tiempo de ejecución. El código cliente puede tratar a todos estos objetos de la misma forma, ya que todos siguen una interfaz común. (Decorator Method)El componente de software que hay que ampliar se “decora” con una o más clases decoradoras, que lo envuelven completamente, siguiendo el patrón de diseño Decorador. Cada decorador es del mismo tipo que el componente al que envuelve y, por lo tanto, tiene la misma interfaz. De esta manera, las llamadas de método entrantes pueden delegarse fácilmente al componente adjunto mientras lleva a cabo una funcionalidad. Las llamadas también pueden procesarse dentro del decorador.
Al igual que otros patrones, como, por ejemplo, el patrón Strategy o el Builder, el patrón Decorator tiene como objetivo hacer que los componentes del software orientado a objetos sean más flexibles y fáciles de reutilizar. Con este fin, el enfoque permite a los desarrolladores añadir y eliminar las dependencias de un objeto de manera dinámica y, cuando sea necesario, durante el tiempo de ejecución. Esto convierte al nombrado patrón en una buena alternativa al uso de subclases, las cuales pueden complementar a una clase, pero no permiten hacer ajustes durante el tiempo de ejecución.

### Analogía en el mundo real
![image](https://user-images.githubusercontent.com/81381529/157154057-6c291025-1ae1-4ebf-91d4-33b968e679c9.png)

### Estructura
![image](https://user-images.githubusercontent.com/81381529/157154091-9fc5cee1-2258-4a11-b24d-b315af34f2f1.png)

## Código 
### Main.py
```
import Decorator

if __name__ == "__main__":

    ropa_deportiva = Decorator.RopaDeportiva(Decorator.RopaBasica())
    ropa_deportiva.operation()
    print("-----")

    ModeloInvieroDeportivo = Decorator.RopaDeportiva(Decorator.RopaInvierno(Decorator.RopaBasica()))
    ModeloInvieroDeportivo.operation()
 ```
 ### _init_.py
```
from .Decorator import RopaInvierno, RopaBasica, RopaDeportiva 
 ```
 
 ### Decorator.py
 ```
from abc import abstractmethod, ABC

class Ropa(ABC):
    @abstractmethod
    def operation(self):
        pass

class Decorator(Ropa):
    def __init__(self, ropa):
        self._ropa = ropa

    @abstractmethod
    def operation(self):
        self._ropa.operation()

class RopaBasica(Ropa):
    def operation(self):
        print("Ropa Básica")

class RopaDeportiva(Decorator):
    def __init__(self, ropa):
        super(RopaDeportiva, self).__init__(ropa)

    def operation(self):
        super(RopaDeportiva, self).operation()
        print("Añadiendo Rasgos Deportivos")

class RopaInvierno(Decorator):
    def __init__(self, ropa):
        super(RopaInvierno, self).__init__(ropa)

    def operation(self):
        super(RopaInvierno, self).operation()
        print("Añadiendo Rasgos de Invierno")
 ```
 
