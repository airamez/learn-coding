package _01_Intro

import kotlin.math.*

/*
Kotlin library with mathematical functions
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.math/
 */

fun main () {
    println("PI = $PI")
    println("abs(10)  = ${abs(10)}")
    println("abs(-10) = ${abs(-10)}")

    val number1 = 15
    val number2 = 7
    val number3 = 3
    println("max($number1, $number2) = ${max(number1, number2)}")
    println("min($number1, $number2) = ${min(number1, number2)}")
    println("max($number1, $number2, $number3)= ${max(max(number1, number2), number3)}")
    println("min($number1, $number2, $number3) = ${min(min(number1, number2), number3)}")

    val base = 2
    val exponent = 6
    val power = base.toDouble().pow(exponent).toInt()
    println("2^4 = $power")
    println("{number2}^{number3} = ${number2.toDouble().pow(number3)}")

    println("Square Root of 81 = ${sqrt(81.0)}")
    println("Square Root of 121 = ${sqrt(121.0)}")
    println("Square Root of 541 = ${sqrt(541.0)}")

    val value = 3.477434
    println("Ceiling of $value  : ${ceil(value)}")
    println("Floor of $value    : ${floor(value)}")
}