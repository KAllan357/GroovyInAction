myList = [1,2,3]

assert myList.size() == 3

assert myList[0] == 1
assert myList instanceof ArrayList

emptyList = []
assert emptyList.size() == 0

longList = (0..1000).toList()
assert longList[555] == 555

explicitList = new ArrayList()
explicitList.addAll(myList)
assert explicitList.size() == 3
explicitList[0] = 10
assert explicitList[0] == 10

explicitList = new LinkedList(myList)
assert explicitList.size() == 3

//overloaded subscript operator
myList = ['a','b','c','d','e','f']
myList2 = ('a'..'f').toList() //use a range instead of typing all that junk in the line above.
assert myList == myList2

//getAt
assert myList[0..2] == ['a', 'b', 'c']
assert myList[0,2,4] == ['a', 'c', 'e']

//putAt
myList[0..2] = ('x'..'z').toList()
assert myList == ['x','y','z','d','e','f']

myList[3..5] = []
assert myList == ['x','y','z']

//putAt using an additional list
myList[1..1] = ['y','1','2']
assert myList == ['x','y','1','2','z']

//reverse ranges work too
assert myList[4..1] == ['z','2','1','y']

//negative numbers count from the end of the list
//this works with ranges too. -1 is the last
assert myList[2..-1] == ['1','2','z']
assert myList[-2] == '2'

//overloaded plus, minus, and multiply on lists
myList = []
myList +='a'
assert myList == ['a']

myList += ['b','c']
assert myList == ['a','b','c']

//leftShift is like append
myList = []
myList << 'a' << 'b'
assert myList == ['a','b']

//Minus
assert myList - ['b'] == ['a']

//multiply
assert myList * 2 == ['a','b','a','b']