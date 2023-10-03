fun main(){

    println("Ejercicio 2")
    println("Superficie y perímetro de un rectángulo")

    var lado1 : Double = 0.0
    var lado2 : Double = 0.0
    var superficie : Double = 0.0
    var perimetro : Double = 0.0

    print("Introduce la base del rectángulo: ")
    lado1 = readln().toDouble()
    print("Introduce la altura del rectángulo: ")
    lado2 = readln().toDouble()

    superficie = lado1 * lado2
    perimetro = 2 * (lado1 + lado2)

    println("La superficie es de $superficie")
    println("El perímetro es de $perimetro")
}