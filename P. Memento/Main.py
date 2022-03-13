import Memento

creador = Memento.Originator("Mariel", "@MarielSalcedo")
vigilante= Memento.Caretaker()
vigilante.memento = creador.createMemento()
print("")
print("Nombre completo: " + creador.nombre + " " + creador.usuario )

creador.nombre="Andrea"
creador.usuario="@AndreaHerrera"
print("Nombre completo: " + creador.nombre + " " + creador.usuario )

creador.nombre="Jonathan"
creador.usuario="@JonathanGB"
print("Nombre completo: " + creador.nombre + " " + creador.usuario )

creador.setMemento( vigilante.memento )
print("")
print("Nombre completo: " + creador.nombre + " " + creador.usuario )
print("")
