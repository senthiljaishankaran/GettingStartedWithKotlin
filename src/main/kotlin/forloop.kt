// for is used mostly when the iteration of the loop is known

fun main(){
    val arrayItems= arrayOf(1,2,3)
    for (i in arrayItems){
        println(i)
        // here if we use print(arrayItems[i]) method it will throw array out of bound exception
        // cause index starts from zero and arrayItem instance i starts from 1
    }

    // for loop without array
    for(j in 1..5){
        println(j)
    }

    // different starting point
    for(k in 5..15){
        println(k)
    }
    // with statement
    for(l in 10 downTo 5){
        println(l)
    }

    // with statements in steps
    for(m in 10 downTo 5 step 2){
        println(m)
    }

    // printing whole alphabet
    for (n in 'a'..'z'){
        println(n)
    }

    // finding max number
    var numberArray= arrayOf(9,5,3,10,21,7,300)
    var max=numberArray[0]
    for(item in numberArray){
        if(item > max){
            max=item
        }
    }
    println("Maximum number is $max")

    // sum of the array
    var sumArray= arrayOf(3,7,8)
    var sum=0
    for(items in sumArray){
        sum += items
    }
    println(sum)

    // Average of the array
    var average=0.0
    println("Enter the Array Element 1:")
    var arrayElement1= readlnOrNull()?.toInt()
    println("Enter the Array Element 2:")
    var arrayElement2= readlnOrNull()?.toInt()
    println("Enter the Array Element 3:")
    var arrayElement3= readlnOrNull()?.toInt()
    println("Enter the Array Element 4:")
    var arrayElement4= readlnOrNull()?.toInt()
    println("Enter the Array Element 5:")
    var arrayElement5= readlnOrNull()?.toInt()

    var arrayElements= arrayOf(arrayElement1,arrayElement2,arrayElement3,arrayElement4,arrayElement5)

    var sumOfArray=0.0
    for(arrays in arrayElements) {
        if (arrays != null) {
            sumOfArray+=arrays
        }
    }
    average=sumOfArray/arrayElements.size
    println(average)

}