function botonnumerico(numero){
    document.getElementById("operacion").value+=numero;
}

function borrar(){
    let value = document.getElementById("operacion").value;
    document.getElementById("operacion").value = value.slice(0, -1);
}

function calcular(){
    let value = document.getElementById("operacion").value;
    console.log(value)
    document.getElementById("operacion").value = eval(value);
}