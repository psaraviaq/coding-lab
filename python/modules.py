
#* Modules are just .py files which can be imported to use their functions and variables
import math
print(math.sqrt(36))

#* But you can also import them directly
from math import log, e
print(log(e))

#* Use aliases to avoid name conflicts
import math as m
print(f'cos(0): {m.cos(0)}')
from math import factorial as fact
print(f'4!: {fact(4)}')

#* With "*" you can import directly all the functions and variables
#! But it's not recommended because it can cause name conflicts
# from math import *