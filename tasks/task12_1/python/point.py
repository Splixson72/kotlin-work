# Task 12.1: Point class
import math
class Point:
    def __init__(self,x,y):
        self.x = x
        self.y=y
    def distance(self):
        return math.sqrt(self.x*self.x + self.y*self.y)
    def distanceTo(self, a,b):
        return math.sqrt((self.x-a)*(self.x-a) + (self.y-b)*(self.y-b))
