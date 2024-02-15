sealed class Usuario


fun puedeTomarPrestado(usuario: Usuario, libro: Libro): String{
    return when (usuario){
        is Estudiante -> "${usuario.nombre}, eres estudiante, puedes tomar prestado 1 semana el libro: ${libro.titulo}"
        is Profesor -> "${usuario.nombre}, eres profesor, puedes tomar prestado 3 semanas el libro: ${libro.titulo}"
        is Visitante -> "${usuario.nombre}, eres un visitante, no puedes tomar prestado el libro: ${libro.titulo}"
    }
}