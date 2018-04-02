package basics

/*
 * Challenge: Using if-expressions in Kotlin
 *
 * In Kotlin, you can use "if" as an expression with a value, not just as a statement as in Java.
 * This challenge familiarizes you with the use of "if" as an expression.
 *
 * This challenge is part of the course "Kotlin for Android and Java Developers":
 * https://www.udemy.com/kotlin-android/?couponCode=GITHUB17
 *
 * @author Peter Sommerhoff
 */
fun main(args: Array<String>) {

  val anonymous = "Anonymous"

  print("Enter your name: ")
  val input = readLine()

  // Use anonymous name if none is given
  val name = if (input != null && input.isNotBlank()) {
    input
  } else {
    anonymous
  }

  // Another if-expression
  val message = if (name == anonymous) {
    "Conscious about your privacy, eh?"
  } else {
    "Welcome $name, the CIA has been informed of your name :)"
  }

  println(message)  // You could also directly use println() above
}