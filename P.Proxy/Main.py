
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