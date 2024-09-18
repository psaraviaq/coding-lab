nums = {7, 2, 3, 7, 2}
print(f'nums={{7, 2, 3, 7, 2}}:\t{nums}')

#* "add", "remove"
nums.add(11)
print(f'\n.add(11):\t\t{nums}')
nums.remove(2)
print(f'.remove(2):\t\t{nums}')

#* set()
print(f'\nset("lists"):\t\t{set("lists")}')

#* Set comprehensions
# print({x for x in range(10) if x not in [1, 3, 4, 5, 6]})