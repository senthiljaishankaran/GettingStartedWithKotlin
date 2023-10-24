// when is preferred over if-else  condition when the block of code depends upon only one input variable
// it is like switch case statement of java

// syntax
fun main(){
    println("Please Enter your Age")
    var age= readlnOrNull()?.toInt()
    when(age){
        in 0..5 -> println("You are a child")
        in 6..17 -> println("You are a Kid")
        18 -> println("You are 18")
        in 19..21 -> println("You are young adult")
        in 22..65 -> println("You are adult")
        else -> println("You are too Old")
    }

    println("Please Enter Your Country")
    var country= readlnOrNull()
    when(country){
        "India" -> println("Namaste")
        "USA" -> println("Hello")
        "Germany" -> println("Hallo")
        else-> println("I dont Know")
    }
}