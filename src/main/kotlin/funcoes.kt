fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int = 0) {
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}

fun media3(vararg notas: Float) {

    if (notas.isNotEmpty()) {
        var soma = 0f
        for (nota in notas) {
            soma += nota
        }
        println("A média é: ${soma / notas.size}")
    }
}


fun <T> media(vararg valores: T) {
    for (valor in valores) {
        println(valor)
    }
}

fun main() {
//    endereco("rua 123", "recife", "PE", "99988877")
//    endereco(cidade = "recife", estado = "PE", cep = "11122233")
//    endereco(cep = "11122233", cidade = "recife", estado = "PE")
//    endereco(estado = "PE", cep = "11122233", cidade = "recife")

//    media3(8f, 9f, 7f)
//    media(8f, 9f, 7f, 1, "matheus", false, "a")

    val str = "lorem ipsum"
    str.capitalize()
    str.decapitalize()
    str.contains("bla")
    str.startsWith("l")
    str.startsWith("L")

    arrayOf(1, 2, 3, 4, 5)

}