import time, sys

# * "try" / "except" blocks

try:
    while True:
        print(".")
        time.sleep(1)
except KeyboardInterrupt:
    sys.exit()
