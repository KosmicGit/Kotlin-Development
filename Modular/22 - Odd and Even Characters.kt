fun main() {
    println("Ejercicio 22")
    println("Caracteres Pares e Impares")
    var numero : Long = 0
    print("Introduce un número: ")
    numero = readln().toLong()

    println(pareimpar(numero))    
}

fun pareimpar(numero: Long) : String{
    var par : Int = 0
    var impar : Int = 0
    var num : Long = numero

    while (num > 0) {
        val digito = num % 10
        if (digito % 2 == 0.toLong()){
            par++
        } else {
            impar++
        }
        num /= 10
    }

    return "$par dígitos pares y $impar digitos impares"
}