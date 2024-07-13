package _01_Intro
/*
# How a computer stores data
  - Binary system
  - Numbers
  - Letters
  - Other types: image, sound, video, files, etc

# Variables definition:
  In programming, a variable is a symbolic name for a storage location that holds a value.
  This value can change or vary during the execution of a program, hence the term “variable”.
# A program process data (variables)
# A constant is a special type of variable that once a initial value is assigned it can't be changed
# Variable declaration
  var name: TYPE = initial_value
# Constant declaration
  val name: TYPE = initial_value
# The type can be omitted

# Kotlin basic types
  - https://kotlinlang.org/docs/basic-types.html
  - Int
  - Double
  - Boolean
  - Character
  - String

# The = operator assigns a value to a variable

 */
fun main() {
    var name = "Jose"
    println(name)

    name = "Jose Santos"
    println(name)

    val age = 52
    println(age)

    val isMarried = true
    println(isMarried)

    val gender = 'M' // Chars are delimited with single quotes
    println(gender)

    val countryOfBirth = "Brazil" // Strings are delimited with double quotes
    //placeOfBirth = "Canada"
    println(countryOfBirth)
}