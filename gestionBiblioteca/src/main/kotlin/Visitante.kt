/**
 * Representa a un visitante en la biblioteca.
 * @property id El identificador único del visitante.
 * @property nombre El nombre del visitante.
 */
data class Visitante(val id: String, val nombre: String) : Usuario()