package com.example.mod3demo1


//fun main() {
//
//    //fonction d'extension
//    fun Int.double() : Int {
//        return this * 2;
//    }
//
//    println(12.double())
//
//}


//fun main() {
//    //elvis operator
//    var name : String? = "michel"
//
//    println(name?.length?:25)
//
//    if(name != null){
//        println(name.length)
//    }else{
//        println(25)
//    }//
//}

//listes
fun main() {

    val colors = mutableListOf("rouge")
    colors.add("jaune")
    colors += "bleu"
    colors += "bleu"

    val nbBleu = colors.filter {color ->
        color == "bleu"
    }.count()

    println(nbBleu)

}











