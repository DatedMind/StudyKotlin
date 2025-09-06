package kt003.kt003

fun main() {
    for (i in 1..10) {
        if (i == 2 || i == 4 || i == 7) continue
        println("$i")
        if(i == 9) break
    }
}