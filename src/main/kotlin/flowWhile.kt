fun main(){

    var index: Int = 0
    while(index < 100){
        println("$index - Matheus")
        index++

        if(index == 50){
            break
        }
    }

    var l: Int = 10
    do {
        println(l)
        l+=20
    } while (l < 100)

}