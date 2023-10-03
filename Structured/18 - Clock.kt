fun main(){
    println("Ejercicio 18")
    println("Reloj")

    var hora : Int = 0
    var minuto : Int = 0
    var segundo : Int = 0

    print("Introduce la hora: ")
    hora = readln().toInt()
    print("Introduce los minutos: ")
    minuto = readln().toInt()
    print("Introduce los segundos: ")
    segundo = readln().toInt()
    segundo++

    while (segundo >= 60){
        segundo -= 60
        minuto++
        while (minuto >= 60){
            minuto -= 60
            hora++
            while (hora >= 24){
                hora -= 24
            }
        }
    }

    println("Horas: $hora, Minutos: $minuto, Segundos: $segundo")

}