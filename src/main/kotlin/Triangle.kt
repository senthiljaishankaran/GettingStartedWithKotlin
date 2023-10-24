import kotlin.math.sqrt

// This Class Inherits the Shape Class that has some Properties
// it is done by using : and name of th class to be inherited
// after inheriting the methods inside the parent class can be accessed by the child class ie triangle class
class Triangle(
    var side1:Double,
    var side2:Double,
    var side3:Double
):Shape("Tri") {
    init {
        println("$name is created with side1=$side1, side2=$side2 ,side3=$side3")
        println("Area of the Triangle is ${area()} ")
    }

    val semiPerimeter=perimeter()/2

    // here we have implemented the parent class abstract method
    // IDE will throw compile time error if we dont implement the methods
    // Important thing is in kotlin all the objects extends Any datatype Object
    override fun perimeter()=side1+side2+side3

    override fun area()= sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3))

}