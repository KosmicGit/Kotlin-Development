fun main(){
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
}

fun grados(n: Double, g: Int) {
    var resultado : Double = 0.0
    if (g == 1) {
        resultado = (n * 9/5) + 32
        var numround = String.format("%.2f", n)
        var resultround = String.format("%.2f", resultado)
        println("$numround ºCelsius = $resultround ºFahrenheit")
    } else if (g == 2) {
        resultado = (n - 32) * 5/9
        var numround = String.format("%.2f", n)
        var resultround = String.format("%.2f", resultado)
        println("$numround ºFahrenheit = $resultround ºCelsius")
    }
}