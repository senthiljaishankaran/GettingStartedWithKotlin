// Class is used to define the properties and attributes of any object that will be created using this class
// It is like a blue print for the object that will be created using this class

fun main(){
    // creating the instance of the class ie object of the class
    var myRectangle=Rectangle(3.0,4.0)

    //Accessing the method of the Rectangle class
    println("Area of the Rectangle is ${myRectangle.area()}")
    println("Perimeter of the Rectangle is ${myRectangle.perimeter()}")
    myRectangle.changeName("Rectangle")
    println(myRectangle.name)

    // Creating an Instance for the Triangle Class
    var myTriangle=Triangle(2.0,4.0,6.0)

    // Accessing the methods of Triangle class
    println("Triangle Perimeter is ${myTriangle.perimeter()}")
    println("Triangle Area is ${myTriangle.area()}")
    myTriangle.changeName("Triangle")
    println(myTriangle.name)


    // Sample instantiation and method overriding of open classes
    //var shape=Shape("senthil")
    //shape.changeName("kumar")
    // above you can see that we can create object of open class and we can override its methods which is not good
    // and parent class should always be open for extension and closed for modification as stated in SOLID principle
    // So the class should be marked as abstract class
    // abstract classes are class that are open for extension and closed for modification
    // Important thing is in kotlin all the objects extends Any datatype Object


    // Initializing object after the overloading constructor implementation in the rectangle class
    var mySampleRec1=Rectangle(4) // Int type square rectangle
    var mySampleRec2=Rectangle(3,4) // Int type rectangle
    var mySampleRec3=Rectangle(3.0,4.0) //double type rectangle
    var mySampleRec4=Rectangle(4.0) //double type square rectangle

    // Using the Companion Object function randomcircle to generate a Circle
    // here we are creating the instance of circle but we are not using the instance to create randomCircle (Important Point)
    var circleCompanion=Circl.randomCircle()

    var rectangleCompanion=Rectangle.randomRectangle()

}