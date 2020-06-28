package com.test.demo

def name="Ranjith"

println name.length() // gives the length of the string
println name[2] // prints the character at the specified index position
println name[-2] // prints the character at the specified index position from the back
println name.indexOf('j')
println name[0..2] // prints the characters present in that range
println name[0,2,4] // prints the character present at that position

println name.substring(2)
println name.substring(2, 5)

def str = "This is a groovy session"

println str.split(" ")
println str-("groovy") // used to substract a particular string
println str.replace("session", "class")

println str.toLowerCase()
println str.toUpperCase()

println str.toList() // used to store string charcters into a list
println "Groovy "*3 // used to pring a string into multiple times

println "Abc".equals("Abc")
println "Abc".equalsIgnoreCase("abc")