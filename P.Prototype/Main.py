from Figure import Silueta

Shape=Silueta(3)
Oval = Shape.Clone(Shape)

if Oval != None:
    print(Oval.getColor())
    print(Oval.getNum())

print(Oval==Shape)

