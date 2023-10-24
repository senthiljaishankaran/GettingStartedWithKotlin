// method overloading
// is same as constructor overloading where we can have many constructor for class that are unique with data type
// method overloading will have same name for all the method but the parameters of the method should be unique

fun main(){
    var myRect=Rectangle(4.0,3.0)
    var myCircle=Circl(3.0)
    var myTri=Triangle(3.0,4.0,4.0)

    val maxAreaRectangleAndCircle=maxArea(myRect,myCircle)
    val maxAreaRectangleCircleAndTriangle=maxArea(myRect,myCircle,myTri)

    println("Maximum Area Of Rectangle and Circle is $maxAreaRectangleAndCircle")
    println("Maximum Area Of Rectangle,Circle and Triangle is $maxAreaRectangleCircleAndTriangle")

}

// sample method overloading functions
// below we can see that the name of both the functions remains same as the parameters of the function differs

fun maxArea(shape1:Shape,shape2:Shape):Double{
    val areaShape1=shape1.area()
    val areaShape2=shape2.area()
    return if (areaShape1>areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1:Shape,shape2:Shape,shape3:Shape):Double{
    val maxOfShape1AndShape2=maxArea(shape1,shape2)
    val areaShape3=shape3.area()
    return if(maxOfShape1AndShape2 > areaShape3) maxOfShape1AndShape2 else areaShape3
}