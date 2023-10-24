// while loop is used usually when the iteration of the loop is unknown

fun main(){
    var x =3
    // while loop must have an condition to fail the loop or else it will run infinitely
    // here x>0 is condition that makes the while loop fail
    while(x >0){
        println("In the while loop times: $x")
        x--
    }

    // using while loop to print the array of items
    var arrayItems= arrayOf("senthil","kumar","jai")
    var arrayLength=arrayItems.size
    var i=0
    while(i < arrayLength){
        println(arrayItems[i])
        i++
    }

    // Assignment Easy

    println("Please Enter a Number: ")
    var userNumber= readlnOrNull()?.toInt()
        println("Let the CountDown Start from $userNumber to 0")
        while(userNumber!=null && userNumber>=0){
            println(userNumber)
            userNumber--
        }

    // Assignment hard
    println("Enter the Number1:")
    var num1= readlnOrNull()?.toInt()
    println("Enter the Number2:")
    var num2= readlnOrNull()?.toInt()

    var initial=0
    var result=1

    while(num1!=null && num2!=null && initial<num2){
     result*=num1
     initial++
    }
    println("$num1 to the power of $num2 is $result")
}