package com.test.demo

def fruits =["Apple","Orange","Grapes"]

println fruits[1]
println fruits.get(2)

def mylist = [1,2,3,['A','B',"Groovy"],4]

println mylist[2]
println mylist[3][2]
println mylist.get(3).get(2)

println mylist[0..2]
println mylist[4..2]

println mylist.contains(3)
println mylist[3].contains("Groovy")

println mylist.size()
//println mylist[3].SIZE

mylist.add(10)
println mylist

mylist<<20 // Adding element to list
println mylist

mylist.add(2, 22)// Adding at particular index
println mylist

mylist.remove(2)
println mylist

mylist = mylist+ [30,40]
println mylist

mylist = mylist.plus([50])
println mylist

mylist = mylist - [30,40]
println mylist

mylist = mylist.minus([50])
println mylist

mylist.pop() // to remove the first element in the list
println mylist

mylist.removeLast() // to remove the last item in the list
println mylist

println mylist.intersect([1,2,3]) // to return the matching elements

mylist = mylist.reverse()
println mylist

mylist = mylist.sort();
println mylist

mylist.clear()
println mylist.isEmpty()


















