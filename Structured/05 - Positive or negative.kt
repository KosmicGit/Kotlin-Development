fun main(){
    println("Ejercicio 5")
    println("Determinar si un número es positivo o negativo")

    var numero : Int = 0

    print("Introduce el número a analizar: ")
    numero = readln().toInt()

    if(numero == 0) {
        println("El $numero es neutro")
    } else if(numero < 0) {
        println("El $numero es negativo")
    } else{
        println("El $numero es positivo")
    }
}