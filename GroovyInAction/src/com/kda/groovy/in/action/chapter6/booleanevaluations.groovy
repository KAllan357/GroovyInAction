//trivial
assert true
assert !false

//matchers must have a match to return true
assert ('a' =~ /./)
assert !('a' =~ /b/)

//collections must be non-empty
assert [1]
assert ![]

//maps must be non-empty
assert ['a':1]
assert ![:]

//strings must be non-empty
assert 'a'
assert !''

//numbers of any type must be nonzero
assert 1
assert 1.1
assert 1.2f
assert 1.3g
assert 2L
assert 3G
assert !0

//anything else must not be null
assert new Object()
assert !null

//boolean gotchas!
if((x = 3)) {   //using extra parenthese, you can 'accidentally' skip an ='s sign. This sets x equal to 3 and evaluates x. Since x is a non-zero number, it evaluates true and prints x
    println x   //you can skip an extra line of assignment here.
}