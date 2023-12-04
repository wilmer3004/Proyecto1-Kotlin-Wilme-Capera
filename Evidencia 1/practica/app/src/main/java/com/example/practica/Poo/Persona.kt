package com.example.practica.Poo

import java.util.Locale

class Persona {
//    get and set de nombre
    var nombre:String = ""

//    get
    get(){
        return field
    }

    //    set
    set(valor) {
        field = valor.uppercase(Locale.getDefault())
    }

    //    get and set de edad
    var edad: Int = 0

        //    get
        get(){
            return field
        }

        //    set
        set(valor) {
            if (valor>=0){
                field = valor
            } else{
                field=0

            }
        }




}
fun main(){
    val persona1 = Persona()
    persona1.edad=10
    persona1.nombre="Wilmer"
    persona1.edad-=5
    println(persona1.edad)
    println(persona1.nombre)


}