//closures can be given parameters
log = ''
(1..10).each{counter -> log += counter}
assert log == '12345678910'

//a single parameter closure can use the reserved word it
log = ''
(1..10).each{log += it}
assert log == '12345678910'

//closures can be assigned to a variable. think new Closure().
def printer = {line -> println line}
//you can also return a closure from a method
def Closure getPrinter() {
    return {line -> println line}
}

//I can resuse code I have in a method, as a closure
class MethodClosureSample {
    int limit
    
    MethodClosureSample(int limit) {
        this.limit = limit
    }
    
    boolean validate(String value) {
        return value.length() <= limit
    }
}

MethodClosureSample first = new MethodClosureSample(6)
MethodClosureSample second = new MethodClosureSample(5)

//reference the validate method of the 'first' object as a closure
Closure firstClosure = first.&validate

def words = ['long string', 'medium', 'short', 'tiny']

assert 'medium' == words.find(firstClosure)
//reference the validate method of the 'second' object as a closure
assert 'short' == words.find(second.&validate)

//method closures can do something special - runtime overload resolution aka multimethods
class MultiMethodSample {
    
    int mysteryMethod(String value) {
        return value.length()
    }
    
    int mysteryMethod(List list) {
        return list.size()
    }
    
    int mysteryMethod(int x, int y) {
        return x+y
    }
}

MultiMethodSample instance = new MultiMethodSample()
Closure multi = instance.&mysteryMethod

assert 10 == multi('string arg')
assert 3 == multi(['a','b','c'])
assert 14 == multi(6, 8)

//how do closures work? closure() or closure.call()
def adder = {x,y -> return x+y}
assert adder(4, 3) == 7
assert adder.call(2,6) == 8

def benchmark(repeat, Closure worker) {
    start = System.currentTimeMillis() //do pre work
    repeat.times{worker(it)}
    stop = System.currentTimeMillis()
    return stop - start
}

slow = benchmark(10000) {(int) it/2}
fast = benchmark(10000) {it.intdiv(2)}
println "slow: " + slow
println "fast: " + fast
assert fast < slow
