import Decorator

if __name__ == "__main__":

    ropa_deportiva = Decorator.RopaDeportiva(Decorator.RopaBasica())
    ropa_deportiva.operation()
    print("-----")

    ModeloInvieroDeportivo = Decorator.RopaDeportiva(Decorator.RopaInvierno(Decorator.RopaBasica()))
    ModeloInvieroDeportivo.operation()