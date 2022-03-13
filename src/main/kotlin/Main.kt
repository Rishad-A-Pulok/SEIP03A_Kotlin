import models.Student

fun main() {
    val s1 = Student(name = "Rishad", dept = "CSE")
    /*s1.name = "Rishad"
    s1.dept = "CSE"*/
    println(s1.getInfo())
    val shape = Shape(8.0, 12.0)
    println(shape.area)

}

class Shape(width:Double, height: Double){ //local variable for default constructor which can't be accessed from elsewhere
    val area: Double
    init {
        area = width*height
    }

}