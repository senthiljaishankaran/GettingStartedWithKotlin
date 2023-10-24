// if else conditional statement
// if can be used alone without else but an else cannot be used without if
// there only be one if and one else and as many as else-if we want in a loop
// multiple if in a nested loop is different

fun main() {
    val x = 4
    val y = 5

    // using only if condition
    // if the condition fails nothing is printed
    if (x < y) {
        println("X is less than Y")
    }

    // using if and else condition
    // here if the first condition fails the second statement will be printed
    val a=5
    val b=4
    // using conditions without curly braces when there is only one command line is needed is permitted in kotlin
    if (a<b)
        println("a is less than b")
    else
        println("a is greater than b")

    // using if and else if condition
    // this condition is used when we have more than two condition
    // we can more than on elseif condition in a block of code
    val c=7
    val d=7

    if (c < d)
        println("c is lesser than d")
    else if(c>d)
        println("c is greater than d")
    else
        println("c is equal to d")

    // using logical operator inside an if condition
    val e =11
    val f =20
    // assign a value to the variable based on the if condition
    val g =if(e>f) 4 else 25
    if(e>f && e>g){
        println("Both the condition satisfied")
    }else if(e>f || e>g){
        println("One of the condition satisfied")
    }else{
        println("Both conditions are not satisfied")
    }

    // Assignment palindrome or not
    var palindromeString:String="racecar"
    var reversedPalindromeString:String=palindromeString.reversed()

    if(palindromeString == reversedPalindromeString)
        println("The given String $palindromeString is a Palindrome")
    else
        println("The given String $palindromeString is not a Palindrome")

}