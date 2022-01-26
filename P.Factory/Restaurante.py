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