class Usuario (
    private val nombre: String,
    private val edad: Int
){
    //Lista de videojuegos
    private val Biblioteca = mutableListOf<Videojuego>()

    //Funcion para agregar videojuegos
    fun agregarVideojuego(v: Videojuego){
        Biblioteca.add(v)
    }

    //Funcion para mostrar la lista de videojuegos
    fun mostrarVideojuego(): String{
        if(Biblioteca.isEmpty())return "No tienes videojuegos agregados"
        //else
        return Biblioteca.joinToString(separator = "\n"){
            juego->"${juego.description()}"
        }
    }

    fun mostrarFavoritoPorGenero(genero: String): List<Videojuego>{
        //Devolvemos los juegos con el genero ingresado e ignoramos mayus y minus
        return Biblioteca.filter { it.description().contains(genero, ignoreCase = true) }
    }

    fun obtenerResumen(): String{
        return "Usuario $nombre ($edad años) \n Juegos ${mostrarVideojuego()}"
    }
}