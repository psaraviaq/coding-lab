
#* "Modules" are files that contain Python code
import math
print(f'sqrt(36): {math.sqrt(36)}')

#* from "___" import "___"
from math import log, e
print(f'ln(e): {log(e)}')

#* Alias
import math as m
from math import factorial as f
print(f'cos(0): {m.cos(0)}')
print(f'4!: {f(4)}')

#! "*" (not recommended)
# from math import *

#* Only runs when the module is run directly, not imported
#! When you import a module, all the code in it is executed
if __name__ == "__main__":
    print("...")