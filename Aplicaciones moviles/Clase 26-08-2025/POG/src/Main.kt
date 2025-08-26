fun main() {
    //Crear Videojuegos
    val fifa = Videojuego("Fifa 26", "Deportes", 2025,"EA SPORTS",59990)
    val pes = Videojuego("Pes 2026", "Deportes", 2025,"EA SPORTS",49990)
    val gta = Videojuego("GTA VI", "Mundo Abierto",2026, "RockStar Games",80000)
    val ageOfEmpires = Videojuego("Age Of Empires","Estrategia", 2022, "EssemblersStudios", 50000)
    val lol = Videojuego("League Of Legends", "Moba", 2009, "Riot Games", 0)

    //Crear consolas
    val ps5 = Consola("Play Station 5", "Sony",550000,6)
    val xboxS = Consola("Xbox Series S", "Microsoft", 300000,5)

    //Crear usuario
    val usuario = Usuario("Nicolás Bello", 23)

    //Agregar Videojuegos a la cuenta usuario
    usuario.agregarVideojuego(fifa)
    usuario.agregarVideojuego(pes)
    usuario.agregarVideojuego(gta)
    usuario.agregarVideojuego(lol)

    //Mostrar resumen de usuairo
    println(usuario.obtenerResumen())

    //Filtrar juegos por genero
    println("\n Juegos por Deportes: ")
    usuario.mostrarFavoritoPorGenero("Deportes").forEach{
        println("- ${it.description()}")
    }

    //Lista de productos disponibles
    val producto: List<Producto> = listOf(fifa,pes,gta,ageOfEmpires,lol)
    println("\nCatalogo de productos: ")
    producto.forEach{
        println("- ${it.description()} | Precio final con descuento: ${it.precioFinal()}")
    }

    //Disponibilidad de consolas
    println("\nDisponibilidad de consolas:")
    if (ps5.tieneStock()) println("\nEl producto se encuentra disponible\nEl stock disponible es de: ${ps5.description()}")
    if (!xboxS.tieneStock()) println("\nEl producto no se encuentra disponible\nEl stock disponible es de: ${xboxS.description()}")


    //Si hay juegos retros
    println("\nJuegos Retro:")
    producto.filterIsInstance<Videojuego>().filter { it.esRetro() }.forEach{
        println("- ${it.description()}")
    }
}