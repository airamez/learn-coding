package _01_Intro

/*
 https://kotlinlang.org/docs/keyword-reference.html#operators-and-special-symbols

 Assignment: =
 Augmented Assignments: += -= *= /= %=
 Mathematical operators: + - * / %
 Increment and decrement: ++ --
 */

fun main () {
    println("Assignment")

    var number = 0
    println("number: $number")

    number = number + 2
    println("number: $number")

    println("Increments")

    println("number: $number")
    number++
    println("number: $number")

    println("number: ${number++}")
    println("number: $number")

    println("number: ${++number}")
    println("number: $number")

    println("number: ${number--}")
    println("number: $number")

    println("number: ${--number}")
    println("number: $number")

    println("Mathematical")

    var result = number + 5 * 3
    println("number + 5 * 3 = $result")

    result = (number + 5) * 3
    println("(number + 5) * 3 = $result")

    // THIS IS IMPORTANT
    // Attention to division because the operand's type
    // define if it is a real or integer division
    number = 7
    result = number / 2
    println("number / 2 = $result")

    var doubleResult = number.toDouble() / 2
    println("counterFunction.toDouble / 2 = $doubleResult")

    // Explain the case below.
    //result = number.toDouble() / 2

    // THIS IS IMPORTANT
    // Attention to module
    number = 8
    println("number = $number")
    val mod = number % 3
    println("number % 3 = $mod")

    println("Augmented Assignments")

    println("number: $number")
    number += 10 // counter = counter + 10
    println("number: $number")

    val factor = 10
    println("Factor: $factor")

    number += factor
    println("number: $number")

    number -= factor
    println("number: $number")

    number *= factor
    println("number: $number")

    number /= 10
    println("number: $number")

    println()
}