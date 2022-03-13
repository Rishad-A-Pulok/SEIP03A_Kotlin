package models

class Student(val name: String = "", val dept: String = "") { //Primary constructor
    /*var name: String = ""  //these variables are by default public
    var dept: String = ""  */
    init { // This is the body of primary constructor

    }

    fun getInfo() = "$name $dept" //Compact function

}