myList = [1,2,3]

assert myList.size() == 3
println myList.size()

assert myList[0] == 1
assert myList instanceof ArrayList

emptyList = []
assert emptyList.size() == 0

longList = (0..1000).toList()
assert longList[555] == 555