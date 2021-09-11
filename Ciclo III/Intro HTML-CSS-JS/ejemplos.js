function incrementar() {
    const inputBox = document.getElementById("box");
    inputBox.value = parseInt(inputBox.value) + 1;
    console.log(inputBox);
}

function mostrarTexto() {
    const inputTexto = document.getElementById("box2").value;

    const parrafo = document.getElementById("mostrar");
    parrafo.innerHTML = `<h3>${inputTexto}</h3>`;
    // let imagen = document.createElement('img');
    // parrafo.appendChild(imagen);
    
    parrafo.innerHTML = `<h3>${inputTexto}</h3><br /><img src="imagen1.png">`;
}