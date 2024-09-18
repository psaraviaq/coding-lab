coordinates = (10, 20, 30)

#! Tuple's elements cannot be modified
# coordinates[0] = 25
#* But you can reassign the whole tuple
coordinates = (25, 18, 32)
print("coordinates: ", coordinates)

#* Access
print("\n[0]: ", coordinates[0])
print("x, y, z = coordinates")
x, y, z = coordinates
print(f"x: {x}, y: {y}, z: {z}\n")

#* Loops
for x in coordinates:
    print(f"{x}...")