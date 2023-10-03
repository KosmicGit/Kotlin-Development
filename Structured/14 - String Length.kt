fun main(){
    println("Ejercicio 14")
    println("Número de cifras")

    var num1 : Int = 0
    var num2 : Int = 0

    println("Recuerde que su número debe ser menor de 5 cifras")
    print("Introduzca su número: ")
    num1 = readln().toInt()

    if (num1.toString().length > 5){
        println("El número $num1 tiene más de 5 cifras")
    } else if (num1 < 0) {
        num2 = abs(num1)
    }
    println("El número $num1 tiene ${num2.toString().length} cifras")
}