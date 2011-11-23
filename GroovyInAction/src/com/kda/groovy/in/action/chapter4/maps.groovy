def myMap = [a:1, b:2, c:3]

assert myMap instanceof HashMap
assert myMap.size() == 3
assert myMap['a'] == 1

def emptyMap = [:]
assert emptyMap.size() == 0

def explicitMap = new TreeMap()
explicitMap.putAll(myMap)
assert explicitMap['a'] == 1

//kinda strange because you can ommit the strings like above, what if you want a variable key?
def x = 'a'
assert ['x':1] == [x:1]
assert ['a':1] == [(x):1]

myMap = [a:1, b:2, c:3]
assert myMap['a'] == 1
assert myMap.a == 1
assert myMap.get('a') == 1
assert myMap.get('a', 0) == 1

assert myMap['d'] == null
assert myMap.d == null
assert myMap.get('d') == null

//if the key is there it will return the 2nd param. if its not, it will insert and return the 2nd param
assert myMap.get('d', 0) == 0

myMap['d'] = 1
assert myMap.d == 1
myMap.d = 2
assert myMap.d == 2

myMap = [a:1, b:2, c:3]
def otherMap = [b:2, c:3, a:1]

assert myMap == otherMap

assert myMap.isEmpty() == false
assert myMap.size() == 3
assert myMap.containsKey('a')
assert myMap.containsValue(1)

assert myMap.any{entry -> entry.value > 2}
assert myMap.every{entry -> entry.key < 'd'}

//iterate over entries
def store = ''
myMap.each{entry ->
        store += entry.key
        store += entry.value
    }
assert store.contains('a1')
assert store.contains('b2')

//iterate over key/values
store = ''
myMap.each{key, value ->
        store += key
        store += value
    }
assert store.contains('a1')
assert store.contains('b2')

//use keySet and each closure
store = ''
myMap.keySet().each{key ->
        store += key
    }
assert store.contains('a')
assert store.contains('b')

//use values
store = ''
myMap.values().each{value ->
        store += value
    }
assert store.contains('1')
assert store.contains('2')
