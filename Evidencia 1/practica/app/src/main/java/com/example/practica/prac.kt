package com.example.practica


fun saludo(nombre: String){
    println("bienvenido a mi repaso $nombre :=)")
}
fun sumar(){
    println("digita el primer numero")
    val num1 = readln().toDouble()
    println("digita el segundo numero")
    val num2 = readln().toDouble()
    var resultado = num1 + num2
    println("el resultado de la suma es = $resultado")
    restar(num1 , num2)
    multiplicar(num1, num2)
}
//llamar funcion dentro de otra funcion
fun restar(nume1 : Double, nume2: Double){
    var resultado =nume1 - nume2
    println("El resultado de la resta es = $resultado")

}

fun multiplicar(numer1 : Double, numer2: Double){
    var resultado =numer1 * numer2
    println("El resultado de la multiplicacion es = $resultado")
}

fun main() {
    saludo(nombre = "Jaider" )
    sumar()
}

fun menor(numero1: Double, numero2 : Double) =if (numero1<numero2) numero1 else numero2
