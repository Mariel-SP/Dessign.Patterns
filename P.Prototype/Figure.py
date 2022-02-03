from abc import abstractclassmethod
import copy


class Figure:
    @abstractclassmethod
    def Clone():
        pass

class Silueta(Figure):
    Color = ''
    Number = 0.0

    def __init__(self, Number):
        self.Color="Red"
        self.Number=3
    
    @staticmethod
    def Clone(Form):
        newForm = copy.deepcopy(Form)
        return newForm
    
    def getColor(self):
        return self.Color
    
    def getNum(self):
        return self.Number