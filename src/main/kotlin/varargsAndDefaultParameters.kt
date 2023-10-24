// Varargs in kotlin is used to declare parameters that accepts a variable number of arguments of same data type

// sample example
fun main(){

    // sample for using list as parameter in the function
    var listarray= listOf(1,2,3,4)
    var MaxNum=sample(listarray)
    println("The Maximum Number is $MaxNum")

    //sample for using vararg parameter in the function
    // since we used vararg we don't want to create a list and it not possible vararg accepts plain data like below
    // we can also insert an array of type vararg in the other vararg parameter like below
    var arrayVararg= intArrayOf(30,43) // use int type array only as we use Int type vararg as parameter
    // here i inserted an array of type vararg as parameter into a function that accepts varag as parameter
    var maxNumber=getMax(2,1,9,4,6,*arrayVararg,11)
    println("The Maximun Number is $maxNumber")

    // Sample for default parameter
    // now we only passed search parameter and it takes the default parameter from the function
    searchFun("Best Programming Language")

    // changing the default parameter
    searchFun("Android Development Course Online","Bing")

    // Named Parameters are used when the function contains many parameters and you dont know the order of the parameters
    // In that case we can use the named parameters to specify the parameter in define the variable for that like below
    searchFun(search = "Is Kotlin best for Android Development", searchEngine = "duckduckgo")

}

// below function is a normal that takes a list of elements as the parameter
fun sample(list:List<Int>):Int{
    var max=list[0]
    for(number in list){
        if(number > max){
            max=number
        }
    }
    return max
}

// as vararg is used to declare parameters that accepts a variable number of arguments e can replace it with vararg
fun getMax(vararg numbers:Int):Int{
    var max=numbers[0]
    for(number in numbers){
        if(number > max){
            max=number
        }
    }
    return max
}

// Default Parameters
// function can have parameters that are set to default when a function is created like below
fun searchFun(search:String,searchEngine:String="Google"){
    // here in this function we have set the value of searchEngine to Google but e can also change it
    println("Searching for $search on $searchEngine")
}









