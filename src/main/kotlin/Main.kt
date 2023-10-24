import java.util.*
import kotlin.math.pow

// Kotlin Programming Basics
// General structure of Kotlin program
// Kotlin program will always starts at fun main()
fun main(){
    // println is the print function to print the content inside it
    // it can be string or int or any datatype we give
    // Strings will be given in doubler quotes
    // Printing a String
    println("My First Kotlin Program")

    // var and val
    // var will define a variable that can be changed or mutable
    // val will define a variable that will remain constant through out the program and cannot be changed ie immutable

    // here we define a variable with var keyword and we define the data type as Integer and the value as 5
    var myVariable:Int=5
    println(myVariable)

    // Kotlin can also automatically decide the data type of the variable
    // as you can see here we did'nt define the variable type down here but still kotlin identifies it
    var noDataTypeString="Senthil"
    var noDataTypeVariable=10
    println(noDataTypeVariable)
    println(noDataTypeString)

    // Implementing Variable in the String Statement Using $
    var name:String="Senthil"
    var age:Int=29
    println("My name is $name and My age is $age")

    // Explaining diff between var and val
    var myNumber:Int=3
    var myName="Kumar"
    println("My name and number before changing $myName and $myNumber")
    myNumber=5
    myName="Senthil"
    println("My name and number after changing $myName and $myNumber")
    // here we are able to change the assigned value as we are using the var key word
    // below we will use the val keyword and see what happens
    val myNewNumber:Int=9
    val myNewName:String="Senthil Kumar"
    println("My name and number unchanged as we used val keyword is $myNewName and $myName")
    // if i try to change the name an compile time error shon that it can't be done cause it is defined using val key word
    //myNewName="Kumar"

    // Boolean datatype can take only true or false values
    var flag:Boolean=true
    println("The value of boolean flag with var keyword before changed is $flag")
    // if i try to assign a new int or string value to an boolean type data it will pop compile time error
    //flag=2
    // but we can assign a boolean value as we used only the var keyword
    flag=false
    println("The value of boolean flag with var keyword after changed is $flag")
    // using val keyword in the data will not allow us to change the value as it did before

    // Arithmetic Operators
    var a:Int= 10
    var b:Int=5
    // Different methods to make the operation
    // Method 1
    var result =a+b
    println(result)
    // Method 2
    println(a+b)
    // Method 3
    println(3+5)
    // using a+=10 like this we can use a-=5 or a*=5 or a/=5
    a+=5
    println(a+b)
    // Operation Expression in the print statement
    println("The result of operation is ${a-b}")

    //Decimal Numbers
    // here we define a Int so the result is given in Int ie with out decimal
    var c=5
    var d=2
    println(c/d)

    // but if wwe need it in decimal then we have to use float or double type data variables
    // Difference between float and double is that double is more precise than float
    // choosing the data type between float or a double is completely depends upon the requirement
    // one thing to keep in mind is Float occupies 32 bit memory and double occupies 64 bit memory
    // if precision matters than choose double and if float precise is enough for the application then choose float cause uses less memory
    // methods to define a folat or double variable
    var e:Float=5F // can be defined like or like below
    var f=2F
    println(e/f)

    // For Double
    var g:Double=5.0 // can be defined like or like below
    var h=2.0
    println(g/h)

    //Assignment
    // calculating volume of sphere
    var pi=3.14159265
    var radius=5.5
    var volumeOfSphere=(0.75*pi* radius.pow(3.0))
    println("The Volume of the Sphere with radius $radius is $volumeOfSphere")

    // Strings
    val myString:String="My Name is Senthil"
    println("Our String is:$myString")
    // using function on the strings
    println("Our String With Function is : ${myString.uppercase(Locale.getDefault())}")
    println("Our String Length is  : ${myString.length}")
    // there are many methods available for the string that we can explore

    // assignment reversing the string
    var stringToReverse="SENTHIL"
    println("Reversed String : ${stringToReverse.reversed()}")

    // Logical and Comparison operator assignment

    val simpleExpression = (3 > 4) || (4 > 3) && (4 <= 4)
    println(simpleExpression)

    val bool=true
    val i=3
    val j=9
    val k=9
    val hardExpression=!(i != k) && bool || k > (i+j) && (!bool || j < k)
    println(hardExpression)
    // decoding the above expression the least priority is  || operator and first priority is () and second priority is &&
    // first priority ()
    println((!bool || j < k)) // false
    println((i != k))// true

    // second priority &&
    // here considering ! of (i !=k) so false with && bool true is false
    println(!(i != k) && bool) // false
    println(k > (i+j) && (!bool || j < k)) // false
    // so finally or operation on above two priority will give us false ie is the hard expression boolean result


}