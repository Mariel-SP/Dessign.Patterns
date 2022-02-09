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