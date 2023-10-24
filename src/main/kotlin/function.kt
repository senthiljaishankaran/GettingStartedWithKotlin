// function is used in kotlin or any programming languages in order to reuse the code and make the code persistent
// we can use the function n number of times with the different parameters

//sample
fun main(){
    printPow(3,3)
    findingSum(5)
    alterSum(6)
    println(add(3,4))
    var list= listOf(2,6,3,7,9,8)
    println("The given list is $list")
    println("Search of the Number")
    var numToSearch= readlnOrNull()?.toInt()
    var searchedNumber=searchNumber(numToSearch,list)
    println("The Index of searched Number is $searchedNumber")
    var searchedNumber1=searchNumberWithoutIndexFunction(numToSearch,list)
    println("The Index of searched Number is $searchedNumber1")
}

fun printPow(base:Int,exponent:Int){
    var result=1
    for(i in 1..exponent){
        result*=base
    }
    println(result)
}

fun findingSum(num:Int){
    var result=0
    var temp=num
    while(temp >0){
        result+=temp
        temp--
    }
    println("The Sum of Number from 1 to $num is $result")
}

// alternate fun for sum if numbers
fun alterSum(n:Int){
    var result=0
    for(i in 1..n){
        result+=i
    }
    println("The Sum of Number from 1 to $n is $result")
}

// function with return value will return the resultant value of function to the function that called it
// sample
fun add(a:Int,b:Int):Int{
    var result =a+b
    return result
}

// assignment
// Print any list and search a number in that list and return the index value of the number
fun searchNumber(searchNum:Int?,list:List<Int>):Int{
    for(item in list){
        if(item == searchNum)
            return list.indexOf(searchNum)
    }
    return -1
}

// alternate method for searching num ber Index with out using indexOf() method
fun searchNumberWithoutIndexFunction(searchNum1: Int?,list: List<Int>):Int{
    for(items in 0..list.size-1){
        if(list[items]==searchNum1){
            return items
        }
    }
    return -1
}