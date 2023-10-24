// Our code may sometimes wont have no errors during compile time but there can occur errors during runtime
// runtime error occurs when the execution of the code is happening
// Kotlin has an Event called Exception that can disrupt the flow of the program when not handled correctly

// sample Exception handling
fun main(){
    // we can identify what kid of Exception a function can throw by clicking on fuc and pressing ctrl+q
    val input=
        try{
            readlnOrNull()?.toInt()
        }catch (e:NumberFormatException) {
            // e is a variable that stores exception
            // here we can use specific exception like number format exception or we put simple e.Exception
            // because all Exception is inherited from Exception class only
            0.0
        }
        // finally block will be executed in all conditions ie. if try block executes or catch block
        // on both conditions finally block will be executed
    finally {
        println("Executing Finally block")
    }
    println("You Entered: $input")

    // Using Try and Catch for Custom Exception
    val division=try {
       dividing(5.0,5.0)
    }catch (e:ZeroInDivisionException){
      println("You have Entered Zero in the input, Please Change it to any Number")
    }
    finally {
        println("Finally block of Custom Exception")
    }
    println("Division Value is $division")

    // assignment
    val myCircle=Circl(4.0)

}

// Creating a Custom Exception
// Any Exception should inherit from Exception class only
class ZeroInDivisionException : Exception("Zero cant be in division")

// Creating function with exception
// Exceptions can be thrown from anywhere in the code not only in functions but also in init block or main block of code
fun dividing(a:Double,b:Double):Double{
    if(a==0.0 || b==0.0)
        throw ZeroInDivisionException()
    return a/b
}
