package com.example.mod3demo1

//var test = "Hello"
//
//fun main() {
//    println("$test world !")
//}

//val et var
//fun main() {
//    //constante
//    val value : Int = 10
//    //value = 15 //pas possible
//
//    //déclaration variable
//    var value2 = "Hello"
//    value2 = "Coucou"
//}

//lazy
fun main() {

    var word : String?  =  "Man !"

    val message by lazy { "hello $word" }
    //println(message)

    word = null
    println(message)
}

















