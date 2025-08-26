class Consola (
    private val modelo: String,
    private val fabricante : String,
    private val precio : Int,
    private val stock : Int
):Producto(){
    override fun description(): String {
        return " $modelo de $fabricante - $$precio CLP ($stock unidades disponibles)"
    }

    override fun precioFinal(): Int {
        //Aplicamos descuento del 10%
        return (precio * 0.9).toInt()
    }

    //Metodo exclusivo
    fun tieneStock(): Boolean{
        return stock > 0
    }
}