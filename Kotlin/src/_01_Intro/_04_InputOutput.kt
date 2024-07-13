package _01_Intro

/*
 # Input fom console
 # readLine: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.io/read-line.html
 # String interpolation: https://kotlinlang.org/docs/java-to-kotlin-idioms-strings.html
*/

fun main() {
    print("What is your name: ")
    val name= readLine() // explain the warning
    println("Olá " + name) // Explain concatenation

    print("What is your age: ")
    val age = readLine()?.toInt() // explain the ? ant toInt
    println(age)

    print("What is your salary: ")
    val salary = readLine()?.toDouble()

    println("Hello " +  name + " your age is " + age + " and salary is " + salary)

    println("Hello $name your age is $age and salary is $salary")
}