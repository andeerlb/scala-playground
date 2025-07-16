trait Animal:
  def speak(): Unit

trait HasTail:
  def wagTail(): Unit

class Dog extends Animal, HasTail:
  def speak(): Unit = println("Woof")
  def wagTail(): Unit = println("⎞⎜⎛  ⎞⎜⎛")

trait Tail:
  def wagTail(): Unit
  def stopTail(): Unit

enum Topping:
  case Cheese, Pepperoni, Sausage, Mushrooms, Onions

class Dog extends Animal, Tail, Legs, RubberyNose

case class Person(
  firstName: String,
  lastName: String,
  age: Int
)