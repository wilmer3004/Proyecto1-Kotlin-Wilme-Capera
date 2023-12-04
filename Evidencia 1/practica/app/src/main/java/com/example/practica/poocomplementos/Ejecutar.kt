package com.example.practica.poocomplementos

fun main(){
    val producto1 = Producto(1, "Leche",5000.0)
    val producto2 = Producto(2, "Pan",2000.0)
    println(producto1)
    println(producto2)
    val seleccion = producto1
    seleccion.precio = 7000.0
    println(producto1)
    val producto3=producto2.copy()
    println(producto3)
    producto3.precio = 3000.0
    producto3.codigo=3
    println(producto3)


}