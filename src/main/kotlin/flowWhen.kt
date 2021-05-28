fun operacao(a: Int, b: Int, c: String) {

    when (c) {
        "Soma" -> println(a + b)
        "Subtração" -> {
            println(a - b)
        }
        else -> {
            println("Operação incorreta")
        }
    }

    when {
        a > 0 && b > 0 ->{
            println("Variáveis maiores que zero")
        }
    }


    // Range - Intervalo de valores - ..
    when (a) {
        in 1..99 -> {
            println("Século")
        }
    }

}

fun main() {
    operacao(10, 10, "Soma")
    operacao(10, 10, "Subtração")
    operacao(10, 10, "Somaa")
}