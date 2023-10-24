// User Input function used to take values from the user and perform operation based on the value
// null values - when ever an function taking a variable is having the chances of having a null or no value
// It should be be marked with nullable "?" so that the compiler will understand that it can contain no values
// user input is read using readLine() function
// whenever we create a variable with readLine function we should mark it with nullable

fun main(){
    var userInput= readLine()
    // readLine function will block the code from executing until any input from the keyboard is entered
    // readLine function can contain a nullable string
    // readLine function will always returns String
    println("You Entered $userInput")
    // when we just printing the input values there wont be any compile time error
    // when we want to call any function with the readLine function then we have to mark it with "?" nullable like below
    // Method 1 to check null
    println(userInput?.uppercase())

    // Inputting number and arithmetic operation in readLine function

    var inputNumber= readLine()
    // in this case even an nullable symbol wont work cause we are  performing an operation on the entered values and it cannot be null
    // so we have to surround the entire block with null check using if condition
    // we might get Number Format exception when we enter text once we convert the readLine to int
    if (inputNumber != null) {
        println(inputNumber.toInt() -5)
    }

    // Assignment
    // readlnOrNull is the alias method to the readLine method for reading the input from the user
    println("Please Enter your age: ")
    val age= readlnOrNull()?.toInt()
    if(age != null) {
        if (age in 1..18)
            println("Your age is $age and you are not an Adult")
        else if(age in 18..65)
            println("Your age is $age and you are an Adult")
        else
            println("Your age is $age and you are Old")
    }
}