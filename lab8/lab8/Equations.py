import math

class Equations:
    def calculate(self, x):
        rad = x * math.pi / 180.0
        try:
            y = 1 / math.tan(x)  
            if rad == math.pi or rad == (math.pi * 2):
                raise Exception("Value cannot be equal to 0 degrees or 180 degrees.")
        except Exception as e:
            print("Exception: ", str(e))
            return 0
        return y
