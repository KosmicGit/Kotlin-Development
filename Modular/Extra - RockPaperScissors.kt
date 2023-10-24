var contador_c : Int = 0
var contador_b : Int = 0

fun main() {
    //Piedra papel tijera
    var count : Int = 1
    println("Piedra papel tijera")

    do {
        println()
        println("Ronda $count")
        var eleccion : Int = 0
        println("Introduce un número")
        while (eleccion < 1 || eleccion > 3) {
            print("1) Piedra, 2) Papel, 3) Tijeras: ")
            eleccion = readln().toInt()

            choice(eleccion)
        }
        var bot: Int = (1..3).random()

        choice_bot(bot)

        checking(eleccion, bot, count)

        count++

    } while (count <= 3)

    println()

    if (contador_c > contador_b) {
        println("Has ganado el juego! Tu: $contador_c | Bot: $contador_b")
    } else if (contador_b > contador_c){
        println("Has perdido el juego... Tu: $contador_c | Bot: $contador_b")
    } else {
        println("Empate... Tu: $contador_c | Bot: $contador_b")
    }
}

fun choice(c : Int) {
    if (c == 1) {
        println("Has seleccionado Piedra")
    } else if (c == 2) {
        println("Has seleccionado Papel")
    } else if (c == 3) {
        println("Has seleccionado Tijeras")
    } else {
        println("Por favor introduce una opción válida")
    }
}

fun choice_bot(c: Int) {
    if (c == 1) {
        println("El bot seleccionó Piedra")
    } else if (c == 2) {
        println("El bot seleccionó Papel")
    } else if (c == 3) {
        println("El bot seleccionó Tijeras")
    }
}

fun checking(c : Int, b : Int, r : Int) {
    if (c == 1 && b == 2) {
        println("Has perdido la ronda $r")
        contador_b++
    } else if (c == 2 && b == 1) {
        println("Has ganado la ronda $r")
        contador_c++
    } else if (c == b) {
        println("Ronda $r Empate")
    } else if (c == 1 && b == 3) {
        println("Has ganado la ronda $r")
        contador_c++
    } else if (c == 3 && b == 1) {
        println("Has perdido la ronda $r")
        contador_b++
    } else if (c == 2 && b == 3) {
        println("Has perdido la ronda $r")
        contador_b++
    } else if (c == 3 && b == 2) {
        println("Has ganado la ronda $r")
        contador_c++
    }
}