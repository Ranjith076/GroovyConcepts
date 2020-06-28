package com.test.demo

def printHello() {
	
	println 'Hello...'
}

printHello()

def sum(int a, int b) {
	
	println "Sum is "+ (a+b)
}

sum(4,5)

def sub(int a,int b) {
	
	def c = a-b
	return c
}

println "Substraction is "+ sub(30,20)