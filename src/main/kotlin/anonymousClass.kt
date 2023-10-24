// When we want to implement a class with a slight modification but dont want to create a new class then anonymous class is used

// Sample Implementation of anonymous class parallelogram with shape class
// as the class is abstract it cannot be instantiated so implementation can either be done by extending shape class or creating anonymous class

fun main(){
    val a=3.0
    val b=4.0
    val height=2.0

    // creating an anonymous class
    // object:Shape is syntax for anonymous class also we need to overload shape class constructor
    val parallelogram=object:Shape("Parallelogram",a,b,height){

        init {
            println("Parallelogram is created with a=$a,b=$b,height=$height")
            println("Area of the Parallelogram is ${area()}")
            println("Perimeter of the Parallelogram is ${perimeter()}")
            println("Is the given Parallelogram is Rectangle? ${isRectangle()} ")
        }

        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }

        fun isRectangle():Boolean = b==height

    }

    //assignment
    val c=2.0
    val d=4.0
    val e=3.0
    val f=3.0
    val heightTrapezium=2.0
    val trapezium=object:Shape("Trapezium",c,d,e,f,heightTrapezium){


        init {
            println("Trapezium is created with c=$c,d=$d,e=$e,f=$f,height=$heightTrapezium")
            println("Area of Trapezium is ${area()}")
            println("Perimeter of Trapezium is ${perimeter()}")
            println("Is the given Trapezium a Triangle? ${isTriangle()}")
        }

        override fun area(): Double {
            return (c+d)*height/2.0
        }

        override fun perimeter(): Double {
            return c+d+e+f
        }

        fun isTriangle():Boolean = c==e && d==f
    }

}