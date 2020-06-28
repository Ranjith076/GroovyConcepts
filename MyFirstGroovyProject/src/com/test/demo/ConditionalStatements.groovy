package com.test.demo

def num = 0;

// IF Statement

if(num>0)
	println 'Number is +ve'
else if(num==0)
	println 'Number is zero'
else
	println 'Number is -ve'

// Switch Statement
	
def x = 'sjdf'
def res = ""

switch(x) {
	
	case 0:
		res = "x is zero"
		break
	case {x>0}:
		res = "x is +ve"
		break
	case {x<0}:
		res = "x is -ve"
		break
	default:
		res = "Invalid number"
		break
}

println res
		
