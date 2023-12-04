package com.example.practica.pooabstraccion

fun main(){
    val suma = Sumar(8,20)
    suma.operar()
    suma.imprimir()
    val restar = Restar(18,8)
    restar.operar()
    restar.imprimir()
}