
// val	Creates an immutable variable—like final in Java.
// var	Creates a mutable variable, and should only be used when a variable’s contents will change over time.

val a = 1                 // immutable variable

val b = List(1,2,3)       // List is immutable
val c = Map(1 -> "one")   // Map is immutable


case class Person(name: String)
val p = Person("Michael Scott")
p.name           // Michael Scott
p.name = "Joe"   // compiler error (reassignment to val name)

// immutable
val a = 0

// mutable
var b = 1

val msg = "Hello, world"
msg = "Aloha"   // "reassignment to val" error; this won’t compile

var msg = "Hello, world"
msg = "Aloha"   // this compiles because a var can be reassigned

val x: Int = 1   // explicit
val x = 1        // implicit; the compiler infers the type