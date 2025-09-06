package kt002.kt002When_If
    fun main (){
        while(true){
            val nota : Double = readln().toDouble()
            var asda = when(nota){
                in 8.1..10.0 -> {
                    println("Aprovado com louvor")
                    break
                }
                in 7.0..8.0 -> {
                    println("Fez o minimo")
                    break
                }
                in 5.0..6.9 -> {
                    println("Recuperacao")
                    break
                }
                in 0.0..4.9 -> {
                    println("GameOver")
                    break
                }
                else -> "digite denovo"
            }
        }
    }