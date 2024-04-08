package com.example.mod3demo1

//conditions
fun main() {
    println("Renseigner votre age :")
    val age  = readln().toInt()

    if(age < 18){
        println("Mineur !")
    }else{
        println("Majeur !")
    }

    //when
    when(age){
        1,2 -> println("C'est un bébé !")
        in 3..17 -> println("C'est un enfant")
        in 18..64 -> println("Ce n'est pas un retraité")
        else -> println("C'est un vieux !")
    }

    //boucle for
    val pays = arrayOf("France", "Allemagne", "Belgique")

    for(p in pays){
        println(p)
    }

    for(i in 10 downTo 1 step 2){
        println(i)
    }

    //liste mutable
    val list = mutableListOf("Michel", "Victor")
    list.add("Bernard")

    val articles = List<String>(30) {id ->
        "Article $id"
    }

    for(a in articles){
        println(a)
    }



}