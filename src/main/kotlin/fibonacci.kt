fun main(){

    var list= mutableListOf(0,1)
    println("Please Enter the Number to Generate Fibonacci series > 1")
    var count= readlnOrNull()?.toInt()
    if(count!=null){
        for(i in 2..count-1){
            list.add(list[i-2]+list[i-1])
        }
    }
    println(list)
}