nums = [7, 4, 6, 9, 1]
print("og:", nums)

#* Slices
print("\n------- Slicing a list -------")
print("[1:4]:", nums[1:4])
print("[:3]:", nums[:3])
print("[-2:]:", nums[-2:])
print("[::-2]:", nums[::-2]) #! A third number specifies the step

#* Copy
print("\n------- Copying a list -------")
print("[:]:", nums[:])
print(".copy():", nums.copy())
print("[*nums]:", [*nums])

print("\n---------- ADVANCED ----------")

#* "join" works for iterables
# print(" ".join(["I", "like", "Webtoon"]))
# print("...".join("123"))

#* "map" (can take multiple iterables) and "filter" return iterables
# print([*map(int, ["2", "6", "7"])])
# print(list(map(lambda x, y: x**y, [3, 2, 4], [5, 6, 2])))
# print(list(filter(bool, [3, [], True, {}, ""])))
