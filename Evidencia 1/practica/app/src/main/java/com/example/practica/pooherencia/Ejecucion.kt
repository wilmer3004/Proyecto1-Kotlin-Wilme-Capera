package com.example.practica.pooherencia

fun main(){
    val persona = Persona("Wilmer",18)
    persona.imprimir()
    val empleado = Empleado("Wilmer",18,8_000_000.0)
    empleado.imprimir()
    empleado.impuesto()
    val empleado2 = Empleado("Maria",18,3_000_000.0)
    empleado2.imprimir()
    empleado2.impuesto()

}