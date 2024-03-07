package funcoes
inline fun <T> executar ComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Método §nomeFuncao finalizado...")
    }
}
fun somar(a: Int, b: Int): Int f
return a + b
}
fun main(args: Array<String>) {
    val resultado = executar ComLog ("somar") {
        somar (4, 5)
    }
    println(resultado)
}