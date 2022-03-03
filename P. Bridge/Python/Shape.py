from abc import ABC, abstractmethod
class Shape(ABC):

    #drawAPI = None
    def __init__(self, drawAPI):
        self.drawAPI = drawAPI
    
    @abstractmethod
    def draw(self):
        pass
