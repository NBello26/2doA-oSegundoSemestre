document.addEventListener("DOMContentLoaded", () => {
    const modal = document.getElementById("modalDescripcion3");
    const btnAbrir = document.getElementById("botonAbrirModal3");
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
