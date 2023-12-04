package com.example.practica.poocolaboracion

fun main(){

    println("Ingrese la cantidad de clientes que desea ingresar:")
    var num: Int = readln().toInt()
    val bancoBBVA = Banco()
    bancoBBVA.solicitudDatos(num)
    bancoBBVA.movimientos()
    bancoBBVA.estadoCuenta()
}