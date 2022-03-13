class Memento:
    nombre = ""
    usuario = ""

    def __init__(self, nombre = "", usuario = ""):
        self.nombre = nombre
        self.usuario = usuario

class Originator:
    nombre = ""
    usuario = ""

    def __init__(self, nombre, usuario):
        self.nombre = nombre
        self.usuario = usuario
    
    def setMemento(self, a):
        self.nombre = a.nombre
        self.usuario = a.usuario

    def createMemento(self):
        return Memento(self.nombre,self.usuario)

class Caretaker:
    memento = Memento()