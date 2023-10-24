// alternate sum for given vararg elements
fun main(){
    var alternateSumOfNumber=alternateSum(4,3,2,6,4)
    println("The alternate sum for the given vararg elements is $alternateSumOfNumber")
}

fun alternateSum(vararg numbers:Int):Int{
    var sum=0
    var toggle=true
    for(number in numbers){
        if(toggle)
            sum+=number
        else
            sum-=number
        toggle=!toggle
    }
    return sum
}