document.addEventListener("DOMContentLoaded", () => {
    const modal = document.getElementById("modalDescripcion2");
    const btnAbrir = document.getElementById("botonAbrirModal2");
    const spanCerrar = document.querySelector(".cerrar");

    modal.style.display = "none";

    btnAbrir.addEventListener("click", (e) => {
        e.preventDefault();
        e.stopPropagation();
        modal.style.display = "block";
    });

    spanCerrar.addEventListener("click", () => {
        modal.style.display = "none";
    });

    window.addEventListener("click", (event) => {
        if (event.target === modal) {
            modal.style.display = "none";
        }
    });
});
