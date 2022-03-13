package models

class Student(
    val name: String = "",
    val id: String = "",
    val department: Department,
    val courseList: List<Course>
) {

}

class Department(val deptName: String = "", val deptHead: String = "")

class Course(val courseName: String = "", val courseCredit: Double = 0.0)