def isPalindrome(number) {
	String product = number
	return product.reverse() == product;
}

assert !isPalindrome(500)
assert isPalindrome (9009);
/*
maxPalindrome = (999..100).inject( 0, { max, a ->
	(a..100).each { b ->
		String product = a * b
		if(isPalindrome(product)) 
			max = [max, product as Integer].max()
		}
	})
println "The max palindrome is ${maxPalindrome}"*/
bar = []
(999..100).inject 0, { max, a ->
  (a..100).each { b ->
    String product = a * b
    if (product.reverse() == product)
      max = [max, product as Integer].max()
  }
  max
}
println bar.max()


largestPalindrome = 0
(999..100).each {
		b = 999
		while (b >= it) {
			if(it * b <= largestPalindrome) break
			if(isPalindrome(it*b)) largestPalindrome = it*b
			b--;
		}
	}
println largestPalindrome