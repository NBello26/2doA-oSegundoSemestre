document.getElementById("formEstudiante").addEventListener("submit",function(e){
    e.preventDefault();

    let nombre = document.getElementById("nombre").value;
    let correo = document.getElementById("correo").value;
    let edad = document.getElementById("edad").value;
    let fechaNacimiento = document.getElementById("fechanacimiento").value;
    let genero = document.querySelector('input[name="genero"]:checked');
    let lenguajes = Array.from(document.querySelectorAll('input[name="asignaturas"]:checked')).map(el => el.value);
    let curso = document.getElementById('curso').value;
    let comentario = document.getElementById("comentario").value;
    let terminos = document.querySelector('input[name="terminos"]:checked');
    let estudiante={        
        "nombre":nombre,
        "correo":correo,
        "edad":edad,
        "fechaNacimiento":fechaNacimiento,
        "genero":genero.value,
        "lenguajes":lenguajes,
        "curso":curso,
        "comentario":comentario,
        "terminos":terminos.value,
    }
    localStorage.setItem("perfil", JSON.stringify(estudiante));
    console.log(estudiante);
    alert("Datos guardados correctamente");
})