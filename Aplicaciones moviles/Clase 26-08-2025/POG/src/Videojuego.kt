class Videojuego (
    private val nombre: String,
    private val genero : String,
    private val anio : Int,
    private val desarolladores: String,
    private val precio : Int
): Producto(){
    //implementar herencia
    override fun description(): String {
        return " $nombre ($genero, $anio) - $desarolladores - ($$precio CLP)"
    }
    override fun precioFinal(): Int {
        return (precio * 1.19).toInt()
    }

    //metodo adicional
    fun esRetro(): Boolean{
        return anio < 2010
    }
}