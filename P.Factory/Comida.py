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