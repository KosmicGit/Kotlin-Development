//Ejercicio 13
fun main(){
    println("Ejercicio 13")
    println("Numeros primos")
    
    var num : Int = 0
    
    print("Introduce un número: ")
    num = readln().toInt()
    
    primo(num)
}

fun primo(n : Int) {
    if (n != 1) {
        if (n <= 1) {
            println("$n no es un número primo")
        }

        for (i in 2 until n) {
            if (n % i == 0) {
                println("$n no es un número primo")
            }
        }

        println("$n es un número primo")
    } else {
        println("$n no es un número primo")
    }
}
