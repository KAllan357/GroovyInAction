def list = [1,2,3]

//querying methods
assert list.count(2) == 1
assert list.max() == 3
assert list.min() == 1

def even = list.find{ item -> 
        item % 2 == 0
    }
assert even == 2

assert list.every{ item -> item < 5}
assert list.any{ item -> item < 2}

//Iteration methods
def store = ''
list.each{ item -> store += item}
assert store == '123'

store = ''
list.reverseEach{item -> store += item}
assert store == '321'

assert list.join('-') == '1-2-3'

result = list.inject(0){clinks, guests -> clinks += guests}
assert result == 0 + 1+2+3
assert list.sum() == 6
factorial = list.inject(1){fac, item -> fac *= item}
assert factorial == 1 * 1*2*3