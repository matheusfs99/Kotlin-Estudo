fun main() {
    println("Olá mundo!")

//    Declaração de variável
    var nome: String = "Matheus"
    var sobrenome = "Farias"
    var idade: Int = 21

    var character: Char = 'm'

//    Tamanho máximo e mínimo dos tipos de dados
    println("Double: Max: " + Double.MAX_VALUE + " - Double: " + Double.MIN_VALUE)
    println("Float: Max: " + Float.MAX_VALUE + " - Float: " + Float.MIN_VALUE)
    println("Long: Max: " + Long.MAX_VALUE + " - Long: " + Long.MIN_VALUE)
    println("Int: Max: " + Int.MAX_VALUE + " - Min: " + Int.MIN_VALUE)
    println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE)
    println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE)

//    Variáveis mutáveis
    var name = "Matheus Farias"
    name = "Matheus Farias da Silva"

//    Variáveis imutáveis
    val age = 21

//    Inicialização de variável
//    val y // não pode inicializar variável sem valor ou tipo definido
    val x: Int // é possivel declarar variável apenas com seu tipo
    val z = 1354 // é possivel declarar variável apenas com seu valor

    x = 10
//    x = 20


//    Strings
    val frase = "Kotlin é uma linguagem"
    val caracteristica = "show!"

    println(frase + caracteristica)
    println("A linguagem Kotlin é $caracteristica")
    val str = """Lorem ipsum dolor sit amet, consectetur adipiscing elit.
        Nulla vitae sodales nisi, sed consequat justo.
        Quisque tempus lacinia consequat.
    """.trimMargin()
    println("${str.length}")

//    Funções
    val a = 10
    val b = 20
    val c = 30

    fun calculaBonus(a: Int, b: Int, c: Int) {
        println("o bônus é: ${a + b + c}")
    }
    calculaBonus(a, b, c)
//    obs: a função pode ser definida fora do main(), tanto antes como depois do main()

    fun hello(nome: String) : String{
        return "Olá, $nome"
    }

    println(hello("Matheus"))

//    Função em uma linha
    fun hello2(nome: String) = nome
    println(hello2("Farias"))


//    Operações
    println("2 + 2 = ${2 + 2}")
    println("2 - 2 = ${2 - 2}")
    println("2 / 2 = ${2 / 2}")
    println("2 * 2 = ${2 * 2}")
    println("10 % 4 = ${10 % 4}")
    println("10 % 2 = ${10 % 2}")

    var numero = 10

    println("numero++ = ${numero++}") // numero = numero + 1
    println("numero-- = ${numero--}") // numero = numero -1

    println("++numero = ${++numero}") // similar ao numero++, porém o valor já é incrementado antes de ser usado
    println("--numero = ${--numero}") // similar ao numero--, porém o valor já é decrementado antes de ser usado

    numero += 2 // numero = numero + 2
    println("numero+= 2 = $numero")

    numero -= 2 // numero = numero - 2
    println("numero-= 2 = $numero")

    numero /= 2 // numero = numero / 2
    println("numero/= 2 = $numero")

    numero *= 2 // numero = numero * 2
    println("numero*= 2 = $numero")

    numero %= 3 // numero = numero % 3
    println("numero%= 3 = $numero")

}