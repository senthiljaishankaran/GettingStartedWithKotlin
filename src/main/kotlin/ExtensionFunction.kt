// Extension function is used to add method or functions to a class without inheriting it

// sample example of Extension function
fun main(){
    // let us get an input of Type Int from the user
    val inputValue= readlnOrNull()?.toInt()

    // using the extension function with the created object of Int Type
    if(inputValue != null){
        if(inputValue.isPrime())
            println("The Given Number $inputValue is Prime Number")
        else
            println("The Given Number $inputValue is not a Prime Number")
    }
    val newCircle=Circle(2.5)
    println("Area of the Circle is ${newCircle.area()}")
    println("Perimeter of the Circle is ${newCircle.perimeter()}")


}

// here we are creating an extension function with Int type coz we are getting input from the user as integer
// later we will see another example of creating a method to class
// Normally we would create functions like fun Int.isPrime(number:Int) but in case of extension function it is not required
fun Int.isPrime():Boolean{
    for(i in 2..<this-1){
        if(this % i ==0 ){
            return false
        }
    }
    return true
}

// extension function with class example

class Circle(var radius:Double){
    fun area():Double{
        return Math.PI*radius*radius
    }
}

// Creating an extension function with class
// here we are not passing any parameter as we are creating function using class we can utilize the parameter of the class
fun Circle.perimeter():Double{
    return 2*Math.PI*radius // parameter radius accessed from the Circle class
}