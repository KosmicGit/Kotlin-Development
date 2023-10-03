fun main(){
    println("Ejercicio 21")
    println("Números pares del 1 al 20")

    var bucle : Int = 1

    while (bucle <= 20){
        if ((bucle % 2) == 0){
            println(bucle)
        }
        bucle++
    }
}