document.getElementById("formEstudiante").addEventListener("submit",function(e){
    e.preventDefault();

    let nombre = document.getElementById("nombre").value;
    let correo = document.getElementById("correo").value;
    let comentario = document.getElementById("comentario").value;
    let estudiante={        
        "nombre":nombre,
        "correo":correo,
        "comentario":comentario,
    }
    localStorage.setItem("perfil", JSON.stringify(estudiante));
    console.log(estudiante);
    alert("Datos guardados correctamente");
})