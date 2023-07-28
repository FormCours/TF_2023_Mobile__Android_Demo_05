package be.tftic.web2023.demo05_list.models

class Student {

    var FirstName : String
    var LastName : String

    constructor(FirstName: String, LastName: String) {
        this.FirstName = FirstName
        this.LastName = LastName
    }

    override fun toString(): String {
        return "$FirstName $LastName"
    }


}