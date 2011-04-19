assert (0..10).contains(0)
assert (0..10).contains(5)
assert (0..10).contains(10)

//Half exclusive

assert (0..<10).contains(9)
assert (0..<10).contains(10) == false

def a = 0..10

assert a instanceof Range<Comparable>
assert a.contains(5)

a = new IntRange(0, 10)
assert a.contains(5)

//Ranges as Dates
def today = new Date();
def yesterday = today - 1
assert (yesterday..today).size() == 2

assert ('a'..'c').contains('b')

def log = ''
for(element in 5..9) {
	log += element
}
assert log == '56789'

log = ''
(9..5).each {
	log += it	 
}
assert log == '98765'

//Closure with parameter named replacing 'it'
log = ''
(9..<5).each { element ->
	log += element;
}
assert log == '9876'