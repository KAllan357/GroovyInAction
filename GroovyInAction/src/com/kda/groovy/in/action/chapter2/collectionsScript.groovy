#!usr/bin/groovy

//List Operations
def roman = [ '', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']
assert roman[4] == 'IV'
roman[8] = 'VIII'
assert roman.size() == 9

//Map operations
def http = [ 100 : 'CONTINUE',
			 200 : 'OK',
			 400 : 'BAD REQUEST' ]
assert http[200] == 'OK'
http[500] = 'INTERNAL SERVER ERROR'
assert http.size() == 4

//Ranges
def x = 1..10
assert x.contains(5)
assert x.contains(15) == false
assert x.size() == 10
assert x.from == 1
assert x.to == 10
assert x.reverse() == 10..1