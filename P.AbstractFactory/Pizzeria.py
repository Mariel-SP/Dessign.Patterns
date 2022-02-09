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