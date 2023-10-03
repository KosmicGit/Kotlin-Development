fun main(){
    println("Ejercicio 7")
    println("Calculadora de año bisiesto")

    var year : Int = 0

    print("Introduce el año: ")
    year = readln().toInt()

    if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 ==0))) {
        println("El año $year es bisiesto")
    } else {
        println("El año $year no es bisiesto")
    }
}