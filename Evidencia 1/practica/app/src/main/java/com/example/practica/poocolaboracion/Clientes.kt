package com.example.practica.poocolaboracion

import kotlin.random.Random

object Clientes {

    var saldo: Double = 0.0

    //Lista mutable de clientes
    private val clientes = mutableListOf<Cliente>()

    // clase data la cual se encarga de almacenar datos
    data class Cliente(var numeroIdent: Int, var nombre: String, var saldoCuenta: Double)

    // Añadir clientes
    fun addCliente(numeroIdent: Int, nombre: String, saldoCuenta: Double) {
        //Objeto data class
        val nuevoCliente = Cliente(numeroIdent, nombre, saldoCuenta)
        clientes.add(nuevoCliente)
        println("Cliente añadido: $nuevoCliente")
    }

    //Consignar a un cliente
    fun consignarSaldo(valorConsignacion: Double, numIdent: Int) {
        // funcion find encuentra en la lista mutable el primer objeto que sea igual al numero de identificacion que le pasamos
        val cliente = clientes.find { it.numeroIdent == numIdent }
        if (cliente != null) {
            cliente.saldoCuenta += valorConsignacion
            println("Consignación exitosa. Nuevo saldo: ${cliente.saldoCuenta}")
        } else {
            println("Cliente no encontrado")
        }
    }

    //Retirar saldo
    fun retirarSaldo(valor: Double, numIdent: Int) {
        val cliente = clientes.find { it.numeroIdent == numIdent }
        if (cliente != null) {
            if (cliente.saldoCuenta >= 1000.0 && cliente.saldoCuenta - valor >= 0.0) {
                cliente.saldoCuenta -= valor
                println("Retiro exitoso. Nuevo saldo: ${cliente.saldoCuenta}")
            } else {
                println("No se puede realizar el retiro. Saldo insuficiente o es mayor al límite mínimo de cuenta.")
            }
        } else {
            println("Cliente no encontrado")
        }
    }

    //Consultar saldo
    fun consultarSaldo(numIdent: Int): Double? {
        val cliente = clientes.find { it.numeroIdent == numIdent }
        if (cliente != null) {
            println("Cliente encontrado. Saldo: ${cliente.saldoCuenta}")
            return cliente.saldoCuenta
        } else {
            println("Cliente no encontrado")
            return null
        }
    }

    //Saldo total con el metodo sumByDouble
    fun consultarSaldoTotal(): Double {
        return clientes.sumByDouble { it.saldoCuenta }
    }
}
