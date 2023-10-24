import kotlin.random.Random

class Circl(
    var radius:Double
): Shape("Circle"){

    // Companion Object are Singleton Objects whose properties and functions are tied to the class and not to the instance
    // We will create the instance of the circle class but we wont be using the instance to create a random circle
    companion object{
        fun randomCircle():Circl{
            val radius= Random.nextDouble(1.0,10.0)
            return Circl(radius)
        }
    }

    // Exceptions can be thrown from anywhere in the code not only in functions but also in init block or main block of code
    init {
        try{
            if(radius <0)
                throw NegativeRadiusException()
            println("$name is created with radius $radius")
            println("Area of the Circle is ${area()} ")
        }catch(e:NegativeRadiusException){
            println("You Entered a negative radius")
        }

    }

    override fun area(): Double {
        // accessing singleton object PI from objects class by Constants.PI
        return Constants.PI*radius*radius
    }

    override fun perimeter(): Double {
        // accessing singleton object PI from objects class by Constants.PI
        return 2*Constants.PI*radius
    }

    inner class NegativeRadiusException :Exception("radius cant be negative")

}