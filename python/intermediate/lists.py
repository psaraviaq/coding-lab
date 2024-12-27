#
# * "map" (can take multiple iterables) and "filter" return iterables
print([*map(int, ["2", "6", "7"])])
print(list(map(lambda x, y: x**y, [3, 2, 4], [5, 6, 2])))
print(list(filter(bool, [3, [], True, {}, ""])))
