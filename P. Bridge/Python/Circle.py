from Shape import *


class Circle(Shape):
    def __init__(self, x, y, radius, drawAPI):
        super().__init__(drawAPI)
        self._x = x
        self._y = y
        self._radius = radius
    
    def draw(self):
        self.drawAPI.drawCircle(self._radius, self._x, self._y)
