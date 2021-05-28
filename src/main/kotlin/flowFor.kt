fun main() {
    // for - loop

    val str = "Matheus"
    for (c in str) {
        print("$c ")
    }

    for (i in 0..100 step 5) {
        if (i != 80) {
            print("$i ")
        }
    }

    for (j in 100 downTo 0 step 10){
        print("$j ")
    }
}