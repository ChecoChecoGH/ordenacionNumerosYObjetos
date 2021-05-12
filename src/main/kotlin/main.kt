/*
Crea una lista de 100 números aleatorios.

Ordénalos de menor a mayor.

Ordénalos de mayor a menor.

Ordénalos de menor a mayor en una lista nueva.

Ordénalos de mayor a menor en una lista nueva.

Partiendo de la siguiente lista:

Crea una clase que de humanos comparables y crea 100 elementos aleatorios.

Ordénalos por Edad.

Ordénalos alfabéticamente por nombre.

Ordénalos por longitud del nombre.
*/

const val TAMNUMEROS = 100-1
const val NUMEROMINIMO = 1
const val NUMEROMAXIMO = 10

const val TAMALUMNOS = 100-1
const val EDADMINIMO = 9
const val EDADMAXIMO = 35

fun main() {

    val listaNumeros = mutableListOf<Int>()

    for(i in 0..TAMNUMEROS){ listaNumeros.add((NUMEROMINIMO..NUMEROMAXIMO).random()) }


    print("listaNumeros con sort: ")
    listaNumeros.sort()
    listaNumeros.forEach { print("$it, ") }
    println()


    print("listaNumeros con sortDescending: ")
    listaNumeros.sortDescending()
    listaNumeros.forEach { print("$it, ") }
    println()


    print("Nueva lista a partir de listaNumeros con sorted: ")
    val listaNuevaMenoraMayor = listaNumeros.sorted().toMutableList()
    listaNuevaMenoraMayor.forEach { print("$it, ") }
    println()


    print("Nueva lista a partir de listaNumeros con sortedDescending: ")
    val listaNuevaMayoraMenor = listaNumeros.sortedDescending().toMutableList()
    listaNuevaMayoraMenor.forEach { print("$it, ") }
    println()

    val listaAlumnosComparables = mutableListOf<AlumnosComparables>()

    for(i in 0..TAMALUMNOS){
        val alumnoComparable =  AlumnosComparables ("Alumno "+(1..10000).random(), (EDADMINIMO..EDADMAXIMO).random())
        listaAlumnosComparables.add(alumnoComparable)
    }

    println("\nAlumnos ordenados por edad: ")
    listaAlumnosComparables.sortBy { it.edad }
    listaAlumnosComparables.forEach { println(it) }

    println("\nAlumnos ordenados por nombre: ")
    listaAlumnosComparables.sortBy { it.nombre }
    listaAlumnosComparables.forEach { println(it) }

    println("\nAlumnos ordenados por longitud de nombre: ")
    listaAlumnosComparables.sort()
    listaAlumnosComparables.forEach { println(it) }

}

class AlumnosComparables(var nombre : String, var edad : Int) : Comparable<AlumnosComparables> {
    override fun compareTo(other: AlumnosComparables): Int {
        return this.nombre.length - other.nombre.length
    }

    override fun toString(): String {
        return "Nombre: $nombre, edad: $edad"
    }
}

