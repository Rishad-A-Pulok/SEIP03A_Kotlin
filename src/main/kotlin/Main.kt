import models.Course
import models.Department
import models.Student

fun main() {

    val s1 = Student(
        name = "RP",
        id = "182-15-2117",
        department = Department(deptName = "CSE", deptHead = "Rishad Pulok"),
        courseList = listOf<Course>(
            Course(courseName = "OOP", courseCredit = 3.0),
            Course(courseName = "Linear Algebra", courseCredit = 2.0),
            Course(courseName = "Data Mining", courseCredit = 3.0),
        )
    )

    val s2 = Student(
        name = "YEJ",
        id = "st_2312",
        department = Department(deptName = "Management", deptHead = "Rishad"),
        courseList = listOf<Course>(
            Course(courseName = "Accounting", courseCredit = 6.0),
            Course(courseName = "Finance", courseCredit = 3.0),
            Course(courseName = "Marketing", courseCredit = 4.0),
        )
    )
    println(s1.department.deptName)


}
