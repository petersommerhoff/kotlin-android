package basics

import java.util.*

/*
 * Challenge: Using collections and loops in Kotlin
 *
 * Kotlin clearly differentiates between mutable and immutable collections. Also, the "for" loop is
 * similar to the for-in (or for-each) loop in Java. "while" loops follow the same syntax as in Java.
 * In this challenge, you'll apply what you learned about collections and loops.
 *
 * This challenge is part of the course "Kotlin for Android and Java Developers":
 * https://www.udemy.com/kotlin-android/?couponCode=GITHUB17
 *
 * @author Peter Sommerhoff
 */
fun main(args: Array<String>) {

  val randoms: MutableList<Int> = mutableListOf()  // you can also use mutableListOf<Int>()

  for (i in 1..100) {
    randoms.add(Random().nextInt(100) + 1)
  }

  var i = 0
  while (i < randoms.size && randoms[i] > 10) {
    println(randoms[i])
    i++
  }
}