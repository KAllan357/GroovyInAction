//lists can be used in if, switch and for statements
myList = ['a','b','c']

assert myList.isCase('a')
candidate = 'a'
switch(candidate) {
    case myList : assert true; break
    default     : assert false
}

assert ['x','a','z'].grep(myList) == ['a']

//empty lists are false
myList = []
if(myList) assert false

//lists can be iterated with a for loop
log = ''
for (i in [1,'x',5]) {
    log += i
}
assert log == '1x5'

//Methods to manipulate list content
assert [1,[2,3]].flatten() == [1,2,3]

assert [1,2,3].intersect([4,3,1]) == [3,1]
assert [1,2,3].disjoint([4,5,6])

//treat a list like a stack
list = [1,2,3]
popped = list.pop()
assert popped == 3
assert list == [1,2]

//sort and reverse
assert [1,2].reverse() == [2,1]
assert [3,1,2].sort() == [1,2,3]

//sort can take a closure
//the ufo operator is used here to compare the first elements against each other.
def list = [ [1,0], [0,1,2] ]
list = list.sort { a,b -> a[0] <=> b[0] }
assert list == [ [0,1,2], [1,0]]

list = list.sort { item -> item.size() }
assert list == [ [1,0], [0,1,2] ]

//How do I get rid of duplicates?
def x = [1,1,1]
assert [1] == new HashSet(x).toList()
assert [1] == x.unique()

//what about nulls?
x = [1, null, 1]
assert [1,1] == x.findAll{it != null}
assert [1,1] == x.grep{it}