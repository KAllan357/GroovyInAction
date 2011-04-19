current = 1
next = 1
10.times {
	print current + ' '
	newCurrent = next
	next = next + current
	current = newCurrent
}
println ''
println 'Problem 1'

sum = 0
1000.times {
	if( (it % 3 == 0) || (it % 5 == 0) ) sum = sum + it
}
println 'The sum is ' + sum
theSum = (0..999).findAll { it % 3 == 0 || it % 5 == 0 }.sum()
println 'THE SUM ' + theSum 

println 'Problem 2'
current = 1
next = 1
sum = 0
while(current < 4000000) {
	print current + ' '
	newCurrent = next
	next = next + current
	current = newCurrent
	if(current % 2 == 0) sum = sum + current
}
println ''
println 'The Sum is ' + sum

println 'Problem 3'
def isPrime(n) { !maxPrimeFactor(n) }
def maxPrimeFactor(n) {
	if (n > 2) {
		(((int)Math.sqrt(n))..2).find { n % it == 0 && isPrime(it) }
	}
}
println maxPrimeFactor(600851475143)