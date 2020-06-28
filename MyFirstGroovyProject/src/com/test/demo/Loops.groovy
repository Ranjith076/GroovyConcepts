package com.test.demo

println '=====using for loop ========'

for(int i=0;i<5;i++) {
	
	println i
}

println '=====using for in loop========'

for(a in 1..5) {
	
	println a
}

println '=====using upto keyword========'

1.upto(5) { println("$it") }

println '===== using times keyword ========'

5.times { println("$it") }

println '======using steps keyword======='

1.step(10, 2) { println("$it") }

println '====== using while loop ======='

int i=1
while(i<=5) {
	
	println i
	i++
}