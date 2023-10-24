// array is an object itself used to store multiple elements of different or same datatype in it
// values of array can be changed at the runtime

fun main(){
    val arrayItem= arrayOf(1,3,"Senthil",6,true) // we can store any data type
    // if e print the arraylist it will return only the memory address location where the onject is saved
    // in order to access it we use index of the element we need always an array index starts with 0
    // if put array index out of the limit it will through array out of bound exception
    println(arrayItem[2])
}