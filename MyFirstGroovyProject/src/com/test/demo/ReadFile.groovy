package com.test.demo

String filePath = "C:/Users/Ranjith/eclipse-workspace/MyFirstGroovyProject/data1"
File myFile = new File(filePath)

// reading of the file Content
println myFile.text

// collect lines into list
def list = myFile.collect { it }
println "List content is : "+ list

// store file content in an array
def array = myFile as String[]
println "Array content is : "+ array

// read file into a list of string
def lines = myFile.readLines()
println "Lines content is : "+ lines

