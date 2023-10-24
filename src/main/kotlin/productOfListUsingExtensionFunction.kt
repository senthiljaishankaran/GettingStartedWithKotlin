// creating a Extension function for finding product of the list

fun main(){
    var listOfNumber= listOf<Int>(1,2,3,4,5,6)
    var productOfList=listOfNumber.productOfList()
    println("The Product of list $listOfNumber is $productOfList")
}

fun List<Int>.productOfList():Int{
    var product=1
    for(number in this){
        product*=number
    }
    return product
}
