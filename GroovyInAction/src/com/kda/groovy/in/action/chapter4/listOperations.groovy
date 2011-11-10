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