package _01_Intro

import kotlin.random.Random

/*
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/-random/
An abstract class that is implemented by random number generator algorithms.
 */

fun main () {
    var randomInt = Random.nextInt()
    println("randomInt: $randomInt")

    randomInt = Random.nextInt()
    println("randomint: $randomInt")

    randomInt = Random.nextInt()
    println("randomint: $randomInt")

    randomInt = Random.nextInt()
    println("randomint: $randomInt")

    randomInt = Random.nextInt()
    println("randomint: $randomInt")

    randomInt = Random.nextInt(10)
    println("randomint: $randomInt")

    randomInt = Random.nextInt(10)
    println("randomint: $randomInt")

    randomInt = Random.nextInt(10)
    println("randomint: $randomInt")

    randomInt = Random.nextInt(10)
    println("randomint: $randomInt")

    randomInt = Random.nextInt(10)
    println("randomint: $randomInt")

    var randomFrom5to9 = Random.nextInt(5, 10)
    println("randomFrom5to9: $randomFrom5to9")

    randomFrom5to9 = Random.nextInt(5, 10)
    println("randomFrom5to9: $randomFrom5to9")

    randomFrom5to9 = Random.nextInt(5, 10)
    println("randomFrom5to9: $randomFrom5to9")

    randomFrom5to9 = Random.nextInt(5, 10)
    println("randomFrom5to9: $randomFrom5to9")

    randomFrom5to9 = Random.nextInt(5, 10)
    println("randomFrom5to9: $randomFrom5to9")

}