fun main(){
    //Ejercicio 10
    println("Ejercicio 10")
    println("Calculadora de Jornal")

    var dias : Int = 0
    var dia : Int = 0
    var noche : Int = 0
    var check : Int = 0
    var respuesta : String = ""
    var domingo : Boolean = false

    print("Introduce los días trabajados: ")
    dias = readln().toInt()
    print("Introduce las horas diurnas: ")
    dia = readln().toInt()
    print("Introduce las horas nocturnas: ")
    noche = readln().toInt()
    while (check < 1) {
        print("¿Has trabajado en domingo? (s/n): ")
        respuesta = readln()
        if (respuesta == "s" || respuesta == "S"){
            domingo = true
            check++
        } else if (respuesta == "n" || respuesta == "N") {
            domingo = false
            check++
        } else {
            println("Por favor introduce una respuesta válida")
        }
    }

    println(jornaleitor(dias, dia, noche, domingo))
}

fun jornaleitor(dias: Int, d : Int, n : Int, domingo : Boolean) : String {
    var diast = dias
    var diurno = d
    var nocturno = n
    var total : Int = 0

    if (diurno != 0) {
        diurno *= 20
    }
    if (nocturno != 0) {
        nocturno *= 35
    }

    if (domingo) {

    }

    total = diurno + nocturno

    return "Has trabajado $diast, $diurno horas por la mañana, $nocturno horas por la noche y has conseguido un sueldo de $total"
}