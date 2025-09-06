package kt004.kt004

fun main(){

//   Atividade com while: Cliente tem três chances para acertar seu login, usuario: Admin, senha: Admin123

    val usuario = "Admin"
    val senha = "Admin123"

    var tentativas = 3 // max 3

    while(tentativas > 0) {

        print("Digite seu usuario: ")
        var usuariodigitado = readln() ?: ""
        print("\nDigite sua senha: ")
        var senhadigitada = readln() ?: ""
        if (usuario == usuariodigitado && senha == senhadigitada) {
            println("Acesso liberado")
            break
        } else { println("tentativas restantes ${tentativas--}")
        } else if (tentativas == 0) println("Acesso negado")



    }




}