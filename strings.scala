
// Scala strings are similar to Java strings, but they have two great additional features

val firstName = "John"
val mi = 'C'
val lastName = "Doe"

// supports interpolation

println(s"Name: $firstName $mi $lastName")   // "Name: John C Doe"

println(s"2 + 2 = ${2 + 2}")   // prints "2 + 2 = 4"

val x = -1
println(s"x.abs = ${x.abs}")   // prints "x.abs = 1"

// supports multi-line strings
val quote = """The essence of Scala:
               Fusion of functional and object-oriented
               programming in a typed setting."""