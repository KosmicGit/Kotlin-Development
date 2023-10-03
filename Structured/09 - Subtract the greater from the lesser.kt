fun main(){
    println("Ejercicio 9")
    println("Restar el mayor al menor")

    var num1 : Double = 0.0
    var num2 : Double = 0.0

    print("Introduce el primer número: ")
    num1 = readln().toDouble()
    print("Introduce el segundo número: ")
    num2 = readln().toDouble()

    if (num1 > num2){
        println("El número $num1 es mayor que $num2")
        println("La resta de $num1 menos $num2 es ${num1 - num2}")
    } else if (num1 < num2){
        println("El número $num2 es mayor que $num1")
        println("La resta de $num2 menos $num1 es ${num2 - num1}")
    } else {
        println("El número $num1 y $num2 son iguales")
        println("La resta obviamente será de ${num1 - num2}")
    }
}