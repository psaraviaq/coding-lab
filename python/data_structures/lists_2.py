nums = [7, 4, 6, 9, 1]
print("og:", nums)

# * Slicing
print("\n[1:4]:", nums[1:4])
print("[:3]:", nums[:3])
print("[-2:]:", nums[-2:])
# ! A third number specifies the step
print("[::-2]:", nums[::-2])

# * Copying
print("\n[:]:", nums[:])
print(".copy():", nums.copy())
print("[*nums]:", [*nums])

# * "join" (iterables)
#! Only works if items are strings
print('\n"...".join(["I", "like", "comics"]: ', "...".join(["I", "like", "comics"]))
print('" + ".join("123"): ', " + ".join("123"))
