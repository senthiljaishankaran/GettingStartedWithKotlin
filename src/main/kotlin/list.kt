// list is object that can contain number of element in it like array

fun main() {

    // sample list and array diff
    // major difference between array and list is values of array can be changed at runtime and values list cannot
    var list = listOf(1, 2, 3)
    var array = arrayOf(1, 2, 3)
    array[0] = 3 // changed at run time
    //list[0]=1
    // list can be easily printed with print statement but array cannot be printed it only be accessed using for loop and index
    println(list)

    // mutable list is a type of list whose value can be changed at the run time
    var mutablelist= mutableListOf(3,4,5,10,15)
    mutablelist[0]=4
    println(mutablelist)

    // difference between mutable list and array
    // size of array is fixed once initialized but the size of the mutable list can be changed using add and remove function
    mutablelist.add(8) // adds element into the list
    mutablelist.remove(3) // removes the specified element from the list
    mutablelist.removeAt(3) // removes the specified index element
    println(mutablelist)

    // Use case of list
    // getting the list of input from user
    var listOfNumber= mutableListOf<Int>()
    for(item in 1..10){
        var x= readlnOrNull()?.toInt()
        if(x!=null) {
            listOfNumber.add(x)
        }
    }
    println(listOfNumber)
    // we can also use for loop print the list of number
    for(items in listOfNumber){
        println(items)
    }

    // Assignment Easy
    var originalList= mutableListOf<Int>()
    println("Please Enter the 5 Numbers")
    for(item in 1..5){
        var listCreation= readlnOrNull()?.toInt()
        if(listCreation!=null){
            originalList.add(listCreation)
        }
    }
//    var reversedList=originalList.reversed()
//    println("The number in reverse order is:")
//        for (i in reversedList){
//            println(i)
//        }
    println("The number in reverse order is:")
    for(i in originalList.size-1 downTo 0){
        println(originalList[i])
    }
}