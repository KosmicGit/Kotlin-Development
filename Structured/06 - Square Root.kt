fun main(){
    println("Ejercicio 6")
    println("Calculadora de Raíz Cuadrada")

    var numero : Double = 0.0

    print("Introduce el número: ")
    numero = readln().toDouble()
    if (numero < 0) {
        println("Número negativo, no se puede continuar...")
    } else {
        println("La raíz cuadrada de $numero es ${Math.sqrt(numero)}")
    }
}