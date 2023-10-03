fun main(){
    println("Ejercicio 24")
    println("Media de números")

    var cantidad : Int = 0
    var cantidad2 : Int = 0
    var numero : Int = 0
    var resultado : Double = 0.0
    var numeros : IntArray = IntArray(0)

    print("Introduce la cantidad de números a los que quieres hacer la media: ")
    cantidad = readln().toInt()
    cantidad2 = cantidad
    while (cantidad2 > 0){
        print("Introduce el número Nº$cantidad2: ")
        numero = readln().toInt()
        numeros += numero
        cantidad2--
    }

    if (cantidad != 0){
        println("La media de los números:")
        for (n in numeros) {
            print("$n, ")
            resultado += n
        }
        println("es ${resultado / cantidad}")
    }
}