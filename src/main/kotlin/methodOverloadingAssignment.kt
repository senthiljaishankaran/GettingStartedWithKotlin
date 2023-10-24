fun main(){
    var list= listOf(1,2,3,4,5)
    var array= arrayOf(1,2,3,4,5)

    println(printingList(list))
    println(printingList(array))
}

fun printingList(list:List<Int>){
    var i=0
    var j=list.size-1
    var toggle:Boolean= true
    while(i<=j){
        if(toggle){
            println(list[i])
            i++
        }else{
            println(list[j])
            j--
        }
        toggle=!toggle
    }
}

fun printingList(array: Array<Int>){
    var i=0
    var j=array.size-1
    var toggle:Boolean= true
    while(i<=j){
        if(toggle){
            println(array[i])
            i++
        }else{
            println(array[j])
            j--
        }
        toggle=!toggle
    }
}