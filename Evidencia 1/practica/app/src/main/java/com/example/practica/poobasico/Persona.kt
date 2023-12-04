package com.example.practica.poobasico

class Persona {
//    Declarar variables
    var nombre:String = ""
    var edad: Int = 0
    fun inicializar(nombre:String, edad: Int){
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimir(){
        println("Nombre: $nombre edad: $edad")
    }
    fun mayoriaEdad(){
        if(edad>=18){
            println("! $nombre es mayor de edad, puede ingresar!")
        }
        else{
            println("! $nombre es menor de edad, no puede ingresar!")
        }
    }


//    Funciones de unica exprecion
    fun mayoriaEdad1()=when(edad){
        in 18 .. 100 -> println("! $nombre es mayor de edad, puede ingresar!")
        in 0 .. 18 -> println("! $nombre es menor de edad, no puede ingresar!")
        else -> println("!ERROR!")
    }

}