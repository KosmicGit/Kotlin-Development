fun main(){

    println("Ejercicio 1")
    println("Superficie y perímetro de un cuadrado")

    var lado : Double = 0.0
    var superficie : Double = 0.0
    var perimetro : Double = 0.0

    print("Introduce el lado del cuadrado: ")
    lado = readln().toDouble()
    superficie = Math.pow(lado, 2.0)
    perimetro = lado * 4

    println("Superficie: $superficie")
    println("Perimetro: $perimetro")
}