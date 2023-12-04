package com.example.practica.poobasico

class PersonaParametros(var nombre:String, var edad:Int ) {
    fun imprimir(){
        println("Nombre: $nombre edad: $edad")
    }

    fun mayoriaEdad1()=when(edad){
        in 18 .. 100 -> println("! $nombre es mayor de edad, puede ingresar!")
        in 0 .. 18 -> println("! $nombre es menor de edad, no puede ingresar!")
        else -> println("!ERROR!")
    }
}