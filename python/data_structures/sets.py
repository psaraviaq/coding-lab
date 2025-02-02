nums = {7, 2, 3, 7, 2}
print(f"nums={{7, 2, 3, 7, 2}}:\t{nums}")

# * "add"
nums.add(11)
print(f"\n.add(11):\t\t{nums}")

# * "remove"
nums.remove(2)
print(f".remove(2):\t\t{nums}")
# ! Use "discard" if you're not sure the element is in the set
nums.discard(6)

# ^ Use "frozenset" to create an immutable set
frozen_nums = frozenset(nums)
# frozen_nums.add(9)
