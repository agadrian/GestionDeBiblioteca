sealed class Usuario

/**
 * Determina si un usuario puede tomar prestado un libro y devuelve un mensaje indicando la capacidad de préstamo.
 * @param usuario El usuario que desea tomar prestado el libro.
 * @param libro El libro que se desea tomar prestado.
 * @return Un mensaje indicando si el usuario puede tomar prestado el libro y por cuánto tiempo.
 */
fun puedeTomarPrestado(usuario: Usuario, libro: Libro): String{
    return when (usuario){
        is Estudiante -> "${usuario.nombre}, eres estudiante, puedes tomar prestado 1 semana el libro: ${libro.titulo}"
        is Profesor -> "${usuario.nombre}, eres profesor, puedes tomar prestado 3 semanas el libro: ${libro.titulo}"
        is Visitante -> "${usuario.nombre}, eres un visitante, no puedes tomar prestado el libro: ${libro.titulo}"
    }
}