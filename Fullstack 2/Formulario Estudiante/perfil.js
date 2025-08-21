let estudiante = JSON.parse(localStorage.getItem("perfil"));
console.log(estudiante)
if (estudiante != null) {
    let resultado =
        "<p> nombre: " + estudiante.nombre + "</p>" +
        "<p> correo: " + estudiante.correo + "</p>" +
        "<p> edad: " + estudiante.edad + "</p>" +
        "<p> fecha nacimiento: " + estudiante.fechaNacimiento + "</p>" +
        "<p> curso: " + estudiante.cursos + "</p>" +
        "<p> genero: " + estudiante.genero + "</p>" +
        "<p> lenguajes: " + estudiante.lenguajes + "</p>" +
        "<p> comentarios: " + estudiante.comentario + "</p>" +
        "<p> terminos: " + (estudiante.terminos == "on" ? "aceptados" : "rechazados") + "</p>"
    document.getElementByI("resultado").innerHtml = resultado;

} else {
    let resultado = "No hay datos";
    document.getElementById("resultado").innerHtml = resultado;
}

function eliminarDatos() {
    localStorage.removeItem("perfil")
    window.location.reload();
}