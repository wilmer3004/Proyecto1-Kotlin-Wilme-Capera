package com.example.practica.poobasico

class PersonaConstructor constructor(nombre:String, edad: Int){
    var nombre:String = nombre
    var edad: Int = edad
    fun imprimir(){
        println("Nombre: $nombre edad: $edad")
    }

    fun mayoriaEdad1()=when(edad){
        in 18 .. 100 -> println("! $nombre es mayor de edad, puede ingresar!")
        in 0 .. 18 -> println("! $nombre es menor de edad, no puede ingresar!")
        else -> println("!ERROR!")
    }
}