// if - else
fun calculaBonus(cargo: String, salario: Float): Float {
    // gerente jr, gerente sr, coordenador

    /**
    val retorno: Float
    if (cargo == "Coordenador") {
    retorno = salario * 0.2f
    } else if (cargo == "Gerente Sênior") {
    retorno = salario * 2
    } else {
    retorno = salario * 0.5f
    }
    return retorno
    **/

    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Sênior") {
        salario * 2
    } else {
        salario * 0.5f
    }
}


fun maiorDeIdade(idade: Int): Boolean {
    return idade >= 18
}

fun main() {
    maiorDeIdade(10)
    maiorDeIdade(18)
    maiorDeIdade(27)

    val valor = 10
    // Operador ternário
    // String str = valor == 10 ? "Sim": "Não";
    val str = if (valor == 10) "Sim" else "Não"

    // Operador Elvis ?:
    val test: Int? = null // o ? informa pra o kotlin q a variável pode ser null
    val op: Int = test ?: 100 // o operador Elvis verifica se uma variavel é nula.
    // se for, atribui o valor, no caso, 100. se não for, usa a variável
    println(op)


    println(calculaBonus("Coordenador", 1000f))
    println(calculaBonus("Gerente Júnior", 1000f))
    println(calculaBonus("Gerente Sênior", 1000f))
}