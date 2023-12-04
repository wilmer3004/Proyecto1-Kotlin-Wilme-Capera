package com.example.practica.poocolaboracion

class Banco {
    private val clientes: Clientes = Clientes

    // Solicitar datos para envío
    fun solicitudDatos(num: Int) {
        for (x in 1..num) {
            println("Ingrese el número de identificación del cliente #$x: ")
            var numIdent: Int = readLine()?.toIntOrNull() ?: continue
            println("Ingrese el nombre del cliente #$x: ")
            var nombre: String = readLine()?.toString() ?: continue
            clientes.addCliente(numIdent, nombre, 0.0)
        }
    }

    // Movimientos
    fun movimientos() {
        while (true) {
            println("""
                Elija qué movimiento desea realizar:
                1. Consignar
                2. Retirar
                3. Consultar saldo
                4. Salir
            """.trimIndent())
            var movimiento = readLine()?.toIntOrNull() ?: continue
            when (movimiento) {
                //Consignar
                1 -> {
                    println("Ingrese el número de identificación del usuario al que desea consignar:")
                    var num1 = readLine()?.toIntOrNull() ?: continue
                    println("Ingrese el valor de consignación del usuario al que desea consignar:")
                    var num2 = readLine()?.toDoubleOrNull() ?: continue
                    clientes.consignarSaldo(valorConsignacion = num2, numIdent = num1)
                }
                //Retirar
                2 -> {
                    println("Ingrese el número de identificación del usuario que va a retirar:")
                    var num1 = readLine()?.toIntOrNull() ?: continue
                    println("Ingrese el valor de retiro del usuario que desea retirar:")
                    var num2 = readLine()?.toDoubleOrNull() ?: continue
                    val codigoRetiro = clientes.retirarSaldo(valor = num2, numIdent = num1)
                }
                //Consultar
                3 -> {
                    println("Ingrese el número de identificación del usuario que va a consultar:")
                    var num1 = readLine()?.toIntOrNull() ?: continue
                    val saldo = clientes.consultarSaldo(numIdent = num1)
                    if (saldo != null) {
                        println("Saldo actual: $saldo")
                    } else {
                        println("Cliente no encontrado")
                    }
                }
                //Salir
                4 -> {
                    break
                }
                //Error
                else -> {
                    println("!ERROR!")
                }
            }
        }
    }

    // Saldo total de todas las cuentas
    fun estadoCuenta() {
        val total = clientes.consultarSaldoTotal()
        println("El saldo total en el Banco es: $total")
    }
}
