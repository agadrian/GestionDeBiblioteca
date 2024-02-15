/**
 * Representa a un profesor en la biblioteca.
 * @property id El identificador único del profesor.
 * @property nombre El nombre del profesor.
 * @property departamento El departamento al que pertenece el profesor.
 */
data class Profesor(val id:String, val nombre: String, val departamento: String) : Usuario()