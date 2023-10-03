fun main(){

    println("Ejercicio 3")
    println("Área y circunferencia de un círculo")

    var radio : Double = 0.0
    var area : Double = 0.0
    var circunferencia : Double = 0.0

    print("Introduce el rádio: ")
    radio = readln().toDouble()

    area = Math.PI * (radio * radio)
    circunferencia = 2 * Math.PI * radio

    println("El área es de $area")
    println("La circunferencia es de $circunferencia") 
}