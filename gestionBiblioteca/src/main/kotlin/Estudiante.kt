/**
 * Representa a un estudiante en la biblioteca.
 * @property id El identificador único del estudiante.
 * @property nombre El nombre del estudiante.
 * @property carrera La carrera que está cursando el estudiante.
 */
data class Estudiante(val id: String, val nombre: String, val carrera: String) : Usuario()