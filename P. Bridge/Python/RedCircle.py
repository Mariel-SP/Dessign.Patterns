from DrawAPI import *


class RedCircle(DrawAPI):
    def drawCircle(self, radius, x, y):
        print("Drawing Circle[ color: red, radius: " + str(radius) + ", x: " + str(x) + ", " + str(y) + "]")