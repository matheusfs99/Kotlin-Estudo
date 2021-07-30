package exercises

fun geradorTabuada(num:Int){
    for (i in 1..10){
        println("$num x $i = ${num * i}")
    }
}

fun main(){
    geradorTabuada(5)
}