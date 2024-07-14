package _01_Intro

/*
 * Logical expressions return a boolean value
   - https://kotlinlang.org/docs/keyword-reference.html#operators-and-special-symbols
 * Comparison and
   * <, >, <=, >=
 * Logical expressions
   * And = &&
     True and True   = True
     True and False  = False
     False and True  = False
     False and False = False
   * Or = ||
     True and True   = True
     True and False  = True
     False and True  = True
     False and False = False
   * Not = !
     True = False
     False = True
 * Explain the Short circuit versions: and or
 * Examples using: Married, Salary, Has a job, is a manager
 * - Is married
 * - Is married and is a manager
 * - Married and has a job
 * - Salary greater than 150.000 and is a manager
 * - Is married, salary greater than 150.000 and is manager
 * - Not married and Salary greater than or equal to 150.000 or is not a manager
 */

fun main () {
    val isMarried = true
    val salary = 120000
    val isManager = true

    println("isMarried: $isMarried")
    println("salary: $salary")
    println("isManager: $isManager")

    println("isMarried = $isMarried");
    println("Is married and is a manager = ${isMarried && isManager}")
    println("Salary greater than 150.000 and is a manager = ${salary > 150000 && isManager}")
    println("Is married, salary greater than 150.000 and is manager = ${isMarried && salary > 150000 && isManager}")
    println("Not married and Salary greater than or equal to 150.000 or is not a manager = ")
    println(((!isMarried) && salary >= 150000) || (!isManager))

    println("Is married and is a manager = ${isMarried and isManager}")
    println("Is married or is a manager = ${isMarried or isManager}")
}