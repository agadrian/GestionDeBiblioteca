fun main() {

    val empleado = Estudiante("0001", "Javier", "ADE")
    val profesor = Profesor("0002", "Juan", "Matematicas")
    val visitante = Visitante("0003", "Ana")

    val libro = Libro("La sociedad de la nieve", "JJ Santos", 2045)
    
    println(puedeTomarPrestado(empleado, libro))
    println(puedeTomarPrestado(visitante, libro))
    println(puedeTomarPrestado(profesor, libro))
}