import kotlin.io.*

// Declarando as operações
fun soma(x: Float, y: Float) = x + y
fun subtracao(x: Float, y: Float) = x - y
fun divisao(x: Float, y: Float) = x / y
fun multiplicacao(x: Float, y: Float) = x * y


fun main(args: Array<String>) {
//menu de interatividade com o usuário
    println("******* Calculadora Iniciando...******")
    println("")
    println(" *** MENU DE OPERAÇÕES ***")
    println("")
    println(" [ 1 ] - Soma")
    println(" [ 2 ] - Subtração")
    println(" [ 3 ] - Multiplicação")
    println(" [ 4 ] - Divisão")
    println(" [ 5 ] - Sair")
    println("")

    println("Selecione a operação desejada: ")
    val operacao: Int = readLine()!!.toInt()

    println("Digite o primeiro número que desejas calcular: ")
    var x: Float = readLine()!!.toFloat()

    println("Digite o segundo número que desejas calcular: ")
    var y: Float = readLine()!!.toFloat()

    //Condições:
    when(operacao) {
        1 -> println("O resultado da soma é: " + soma(x, y))
        2 -> println("O resultado da subtração é: " + subtracao(x, y))
        3 -> println("O resultado da multiplicação é: " + multiplicacao(x, y))
        4 -> println("O resultado da divisão é: " + divisao(x, y))
        5 -> println("Até logo! ")
        else -> println("Erro desconhecido - tente novamente!")
        }
    }



