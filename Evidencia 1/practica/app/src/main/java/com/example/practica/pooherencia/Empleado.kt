package com.example.practica.pooherencia

class Empleado(nombre:String, edad:Int, val sueldo:Double):Persona(nombre, edad) {
    override fun imprimir() {
        super.imprimir()
        println("Sueldo: $sueldo")
    }
    fun impuesto(){
        if (sueldo>5_000_000){
            println("!Debe pagar impuestos!")
        }
        else if (sueldo<5_000_000 && sueldo>0) {
            println("¡No debe pagar impuestos!")
        }
        else{
            println("¡ERROR!")
        }
    }

}