package exercises

fun imcCalculate(peso: Float, altura:Float): String{
    var imc = peso / (altura*altura)
    var nivel: String
    if (imc < 18.5){
        nivel = "Magreza"
    } else if (imc >= 18.5 && imc < 24.9){
        nivel = "Normal"
    } else if (imc >= 24.9 && imc < 30){
        nivel = "Sobrepeso"
    } else {
        nivel = "Obesidade"
    }
    return nivel
}