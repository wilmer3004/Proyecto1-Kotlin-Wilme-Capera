package com.example.practica.poocomplementos

class Carta(val tipoCarta:DatosCartas, val numCarta: Comparable<*>){
    fun imprimir(){
        println("Carta: $tipoCarta valor: $numCarta")
    }

    fun calculosMatematicos(){
        println("El valor de PI = ${Matematicas.PI}")
        println("Un valor aleatorio entre 1 y 100")
        println(Matematicas.aleatorio(1,100))
    }


}
fun main(){
    var numCartas = arrayOf("A",2,3,4,5,6,7,8,9,10,"J","Q","K")
    val carta = Carta(DatosCartas.values().random(),numCartas.random())
    carta.imprimir()
    carta.calculosMatematicos()
}

