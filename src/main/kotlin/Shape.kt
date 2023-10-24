// this is the parent class that is inherited by the child classes
// open keyword in the states that the class is open for extension ie inheritance and methods can be overrided

// modifiers
// public - can be accessed any where
// private - can be accessed only within the class
// protected - can be accessed only within the class and the classes that inherits it
// internal - can be accessed within the same module ie.. in package where the code are compiled

// A parent class should always be open for extension and closed for modification as stated in SOLID principle
// So the class should be marked as abstract class
// abstract classes are class that are open for extension and closed for modification
// so lets change the class from open to abstract

// also we can make some methods in parent class as abstract which we are quit sure that all inherited child classes should have compulsory
// for example in below inherited classes all child classes is having area and perimeter function
// so we can define those function in parent class and make them abstract so that the child classes can override the function
// this reduces the number of time the function is being created repeatedly

abstract class Shape(
    var name:String
) {

    // Overloading constructor for anonymous class
    constructor(name: String,vararg dimension:Double):this(name)

    init {
        println("I am the SuperClass!")
    }

    // Creating Abstract function
    // here we will only create the function we dont implement it as the implementation part is different for different child classes
    // implementation is done on child classes
    abstract fun area():Double

    abstract fun perimeter():Double

    fun changeName(newName:String){
        name=newName
    }

}