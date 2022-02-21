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