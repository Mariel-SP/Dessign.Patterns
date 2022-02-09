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