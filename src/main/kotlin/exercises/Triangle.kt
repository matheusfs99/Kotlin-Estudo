package exercises

fun triangleType(a: Int, b: Int, c: Int): String{
    var isTriangle = true
    if (a + b < c || a + c < b || b + c < a){
        isTriangle = false
    }

    if (isTriangle){
        if (a == b && a == c){
            return "Equilátero"
        } else if (a != b && a != c && b != c){
            return "Escaleno"
        } else{
            return "Isósceles"
        }
    }else{
        return "Não é um triângulo"
    }
}