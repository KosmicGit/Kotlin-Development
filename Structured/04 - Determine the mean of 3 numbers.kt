fun main(){

    println("Ejercicio 4")
    println("Determinar la media de 3 números")

    fun checkSTR(n: String): Boolean {
        return try {
            val numero = n.toDoubleOrNull()
            numero != null
        } catch (e: NumberFormatException) {
            false
        }
    }

    var n1 = ""
    var n2 = ""
    var n3 = ""

    while (n1 == "" || !checkSTR(n1)){
        print("Introduce el primer número: ")
        n1 = readln()
        if (n1 == ""){
            println("Por favor introduce un número")
        } else if (!checkSTR(n1)) {
            println("Por favor introduce un número válido")
        }
    }
    while (n2 == "" || !checkSTR(n2)){
        print("Introduce el segundo número: ")
        n2 = readln()
        if (n2 == ""){
            println("Por favor introduce un número")
        } else if (!checkSTR(n2)) {
            println("Por favor introduce un número válido")
        }
    }
    while (n3 == "" || !checkSTR(n3)) {
        print("Introduce el tercer número: ")
        n3 = readln()
        if (n3 == "") {
            println("Por favor introduce un número")
        } else if (!checkSTR(n3)) {
            println("Por favor introduce un número válido")
        }
    }
    val num1 : Double = n1.toDouble()
    val num2 : Double = n2.toDouble()
    val num3 : Double = n3.toDouble()

    val resultado : Double = (num1 + num2 + num3)/3
    val resultado2 : Int = Math.round(resultado).toInt()

    println("La media de $n1, $n2 y $n3 es $resultado")
    println("La media de $n1, $n2 y $n3 redondeada es $resultado2")

}