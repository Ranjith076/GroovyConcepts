package com.test.demo

def employee = [
		'name' : 'John',
		'age'  : 40
	]
	
println employee
println employee.name
println employee['name']
println employee.get('age')
println employee.getAt('age')

println employee.size() // to print the size of the map

employee.put('city', 'paris') // to add the element into the map
println employee

println employee.containsKey('city') // to search for the KEY
println employee.containsValue('paris') // to search for the VALUE

println employee.getClass() // to get the class name of the map

def emp2 = employee.clone() // to clone a map
println emp2

employee.each { key,value -> // iteration of map using closure
	
	println "$key : $value"
}

employee.eachWithIndex { key,value,i ->
	
		println "$i | $key : $value"
}

employee.eachWithIndex { entry,i ->
	
		println "$i | $entry.key : $entry.value"
}

employee.clear() // to clear the map
println employee



