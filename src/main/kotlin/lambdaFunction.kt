// Lambda function is similar to an anonymous function because both the functions are unnamed
// where anonymous func uses fun keyword and lambda function uses {}
// lambda function can also be called as short-hand method to write functions
// lambda functions are also used when an need to passes a function as a parameter to another function

// sample lambda function
fun main(){
    var list= listOf(1,2,3,4,5,6,7,8).toList()
    println(list)
    // implementing lambda func of filter method
    var newList=list.filter { it % 2 ==0 }
    println(newList)

    // implementing custom filter lambda method for shape
    var circle1=Circl(2.0)
    var rect1=Rectangle(3.0,4.0)
    var tri1=Triangle(4.0,3.0,2.0)

    var shapes= listOf(circle1,rect1,tri1)

    shapes=shapes.customFilter { it.area() > 10 }.sortedBy { it.area() }
    for(shape in shapes){
        println("${shape.name} : Area =${shape.area()}")
    }

    var list2=(1..10).toList()
    var sum=list2.customSum { it %2==1 }
    println("Sum of the alternating numbers in $list2 is $sum ")

}

// here we are creating a custom extension function that will take another boolean function as its parameter
fun List<Shape>.customFilter(filterFunction:(Shape)-> Boolean):List<Shape>{
    // here List<Shape> is an extension function where customFilter is the function name of extension function
    // and we are passing a function named filterFunction as the parameter which takes Shape as its parameter and returns Boolean
    //finally the extension function returns the shape
    var resultList= mutableListOf<Shape>()
    for(shape in this){
        if(filterFunction(shape)){
            resultList.add(shape)
        }
    }
    return resultList
}

// Important Note
// If our function inside of extension function has more than one parameter then it keyword wont work
// lets say it has shape and string as parameter then
// shapes=shapes.customFilter { shape,string -> shape.area > 20  } // not as it.area()

// assignment
fun List<Int>.customSum(sumFunction:(Int)->Boolean):Int{
    var sum=0
    for(number in this){
        if(sumFunction(number)){
            sum+=number
        }
    }
    return sum
}

// Generic is nothing but making the type of the class or function to be general type
// ie it means it can int,string or boolean
// we made the below function to be generic to all type list that it can be integer,string,boolean,double,float type of lists
// we can also make generic list below to only number specific ie it can accept only int,long,double,float
// by changing the fun<G : Number> doing like this will make the function generic to all list of type number
fun <G> List<G>.customSum(sumFunction:(G)->Boolean): MutableList<G> {
    var resultList= mutableListOf<G>()
    for(shape in this){
        if(sumFunction(shape)){
            resultList.add(shape)
        }
    }
    return resultList
}
