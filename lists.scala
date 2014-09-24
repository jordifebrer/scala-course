// - LIST examples in Scala

val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// filter elements greater than 5
l.filter(x => x > 5)
// refactor
l.filter(_ > 5)

// increase every element * 2
l.map(x => x * 2)
// refactor
l.map(_ * 2)

// sum all elements
l.foldLeft(0)(_ + _)
// refactor
l.reduceLeft(_ + _)

// create a list with range
val l = List.range(1, 11, 1)


// - Appending elements to a list

/*

Remembering Python..

// list - mutable 
l1 = [1, 2, 3, 4, 5]
l1 = l1 + [6, 7, 8, 9 ,19]

// tuple - immutable 
l1 = (1, 2, 3, 4 ,5)
l2 = l1 + (6, 7, 8, 9, 10)

*/

// append elements to a List in Scala (immutable)
val l1 = List(1, 2, 3, 4, 5)
val l2 = l1 :+ 6

val l3 = l1 :: List(7, 8, 9, 10)
// refactor 
val l3 = l1 ++ List(7, 8, 9, 10
