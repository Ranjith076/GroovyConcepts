package com.test.demo

def range = 1..10

println range
println range.size()
println range.getFrom()
println range.getTo()

assert range.from == 1
assert range.to == 10

println range.get(3)
println range[3]

println range.contains(6) // to check the presence of particular value
println range.isReverse() // to check the range reverse

def range2 = range.subList(3, 7) // to create a range from a range
println range2.getFrom()
println range2.getTo()

// iterating of Range

for(i in range2) {
	
	println i
}

range.each { i ->
	
	println "Value are : $i"
}

println range instanceof java.util.List

