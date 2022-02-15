
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