//Ejercicio 7
println("Ejercicio 7")
println("Conversor de Grados")

var cad : String = ""

println("Introduce los grados: ")
cad = readln()
var num : Double? = cad.toDoubleOrNull()

if (num != null) {
    var grado : Int = 0
    println("¿El número introducido es Celsius o Fahrenheit?")
    print("1) Fahrenheit | 2) Celsius : ")
    grado = readln().toInt()
    grados(num, grado)
} else {
    println("Input erroneo, se procede a convertir un número aleatorio")
    num = Random.nextDouble(0.0, 200.0)
    var numround = String.format("%.2f", num)
    val grado : Int = (1..2).random()
    if (grado == 1) {
        println("Se va a proceder a convertir $numround º a Celsius")
        grados(num, grado)
    } else if (grado == 2) {
        println("Se va a proceder a convertir $numround º a Fahrenheit")
    }
}