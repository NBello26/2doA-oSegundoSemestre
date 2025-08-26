abstract class Producto {
    //Producto es una clase abstracta
    //Metodos ADOT
    abstract fun description(): String //Metodo que deben tener todas las clases hijas
    open fun precioFinal(): Int = 0 //Metodo
}