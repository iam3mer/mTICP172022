/*
let elemento = document.getElementById("title-header");
// console.log(elemento.parentNode.parentNode.parentNode.style.color='#FF0000')

// elemento.style.color='#FF0000';

let elementos = document.getElementsByClassName("list-group-item");
// elementos[2].style.color='#00F';

elementos = document.getElementsByTagName("li")
// console.log(elementos)
// elementos[0].style.color='#00F';

elemento = document.querySelector('#title-header');
// console.log(elemento);

elemento = document.querySelector('.list-group-item');
// console.log(elemento);

elementos = document.querySelectorAll('.list-group-item');
console.log(elementos);
*/

const itemsArray = JSON.parse(localStorage.getItem('itemsArray')) || [];

const render = () => {
    const itemsList = document.getElementById('items');

    // Pintar li Opcion 1
    // itemsList.innerHTML = '';
    // for(let i=0; i<itemsArray.length; i++) {
    //     itemsList.innerHTML += `<li>${itemsArray[i]}</li>`;
    // }

    // Pintar li Opcion 2
    const itemTemplate = itemsArray.map(item => `<li>${item}</li>`);
    itemsList.innerHTML = itemTemplate.join('');

    const elementos = document.querySelectorAll('#items li');
    console.log(elementos);

    elementos.forEach((elemento, i) => {

        elemento.classList.add("list-group-item");

        elemento.addEventListener('click', () => {
            
            // console.log(elemento.parentNode, i);
            elemento.parentNode.removeChild(elemento);

            itemsArray.splice(i,1);

            //localstorage
            const lsItem = JSON.stringify(itemsArray);
            localStorage.setItem('itemsArray', lsItem);

            render();
            
        })
    })

}

window.onload = () => {
    render();

    const form = document.getElementById('inputForm');
    
    form.onsubmit = (e) => {

        e.preventDefault();

        const item = document.getElementById('item');
        const textItem = item.value;
        console.log(textItem);
        itemsArray.push(textItem);

        //localstorage
        const lsItem = JSON.stringify(itemsArray);
        localStorage.setItem('itemsArray', lsItem);

        render();

    }
}