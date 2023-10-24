import kotlin.random.Random

// this is how we create a class
// length and height is passed as the parameters of the class whenever an instance of class is created ie an object
// Also it is constructor of the class


// This Class Inherits the Shape Class that has some Properties
// it is done by using : and name of th class to be inherited
// after inheriting the methods inside the parent class can be accessed by the child class ie triangle class

class Rectangle(
    val length:Double,var breadth:Double
) :Shape("Rec"){

    // constructor overloading
    // An Object of an class can be initialized using the constructor
    // And it can be initialized using many constructors and not only with the primary constructor
    // Need for the different constructors arise due to the difference in data types like int,double and so
    // i am creating a constructor overloading for the class rectangle
    // Main Condition for constructor overloading is the uniqueness of the constructor
    // one constructor should not conflict with the other constructors
    constructor(length:Double):this(length,length)
    constructor(length:Int):this(length.toDouble(),length.toDouble())
    constructor(length:Int,breadth: Int):this(length.toDouble(),breadth.toDouble())

    //assignment
    companion object{
        fun randomRectangle():Rectangle{
            val length= Random.nextDouble(1.0,10.0)
            val breadth= Random.nextDouble(1.0,10.0)
            return Rectangle(length, breadth)
        }
    }

    // init block is the first block of code to be executed whenever an instance of the class is created
    init {
        println("$name is Created with Length=$length and Height=$breadth")
        println("Area of the Rectangle is ${area()} ")
    }

    // Creating functions for the class
    // here we have implemented the parent class abstract method
    // IDE will throw compile time error if we dont implement the methods
    // Important thing is in kotlin all the objects extends Any datatype Object
    override fun area()=length*breadth

    override fun perimeter()=2*(length+breadth)

}