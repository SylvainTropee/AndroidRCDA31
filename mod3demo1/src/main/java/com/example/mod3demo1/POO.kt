package com.example.mod3demo1

class Basique

open class Personne(var firstname : String = "Michel", var lastname : String){
    var age : Int = 0

    open fun manger(){
        println("${this.firstname} mange")
    }

    override fun toString(): String {
        return "$firstname $lastname"
    }
}

class Child(var childlastname: String, override var pointDeDefense: Int) : Personne(lastname = childlastname), Defense{
    override fun sayHello(message: String): String {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return super.toString()
    }

    override fun manger() {
        super.manger()
    }
}

interface Defense{
    var pointDeDefense : Int
    fun getDefensePoint(): Int {
        return pointDeDefense
    }
    fun sayHello(message : String) : String
}

fun main() {
    val p = Personne(lastname = "Sapin")
    p.manger()
    val c = Child("Dupont", 10)
    println(c.toString())
}