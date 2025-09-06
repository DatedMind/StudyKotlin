package kt001.kt001_Var_If

    fun main() {

        var salario = 1200.0

        var novoSalario: Unit = //basicamente é um tipo void, ainda não sei para o que serve...
            if (salario >= 1200.0){
                salario *= 1.2
            } else {
                salario *= 1.3
            }

        println(salario)

    }