package com.example.mod3tp1

fun moyenne() {

    println("Entrez le nombre de valeurs :")
    val valeur = readlnOrNull()?.toInt()
    val noteList = mutableListOf<Float>()

    //!! à utiliser avec parcimonie
    for (n in 1..valeur!!) {
        println("Entrez une note :")
        val note = readln().toFloat()
        noteList.add(note)
    }

   println("La moyenne est de ${noteList.average()}")
}

fun moyenneV2(){
    var moyenne = 0.0
    var compteur = 0

    do {
        println("Note  (-1 pour terminer) :")
        val note : Double = readln().toDouble()
        if(note > 0){
            moyenne += note
            compteur++
        }
    }while (note > 0)
    moyenne /= compteur
    println("La moyenne est de " + moyenne)

}

fun main() {
    moyenneV2()
}