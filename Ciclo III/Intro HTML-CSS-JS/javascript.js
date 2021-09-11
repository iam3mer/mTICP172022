/*
Declaración de variables 
var
const
let

Tipos de datos
var age = 2021;
var mision = "Aprender a desarrollar";
var b = true;
var persona = {firstname:"Jhonatan", lastname:"Barrera"};

Matrices
var ciudades = ["Pereira", "Manizales", "Armenia"];
concat()
indexOf()
lastIndexOf()
join()
pop()
push()
reverse()
shift()
unshift()
slice()
sort()
splice()
toString()
valueOf()

Operadores
+
-
*
/
%
++
--
()

Operadores de comparación
==
===
!=
!==
?
<
<=
>
>=

Operadores logicos
&&
||
!

Funciones
function nombre_de_la_funcion (parm1, parm2, ...) {
    // Código de la función
}

Salida de Datos
alert()
confirm()
console.log()
document.write()
prompt()

Funciones Globales
decodeURI()
decodeURIComponent()
encodeURI()
encodeURIComponent()
eval()
isFinite()
isNaN()
Number()
parseInt()
parseFloat()

Ciclos
for (var i; i; i)
while
do while
break
continue

Caracteres de escape
\b
\n
\f
\r
\t
\v
\"
\'

Métodos de cadena
charAt()
charCodeAt()
concat()
indexOf()
lastIndexOf()
match()
replace()
search()
slice()
split()
valueOf()
toLowerCase()
toUpperCase()

Fechas
Date()
Date(AAAA, MM, DD, HH, MM, SS, MM)
Date("2021-09-10")

getDate()
getDay()
getFullYear()
getHours()
getMinutes()
getMonth()
getSeconds()
getMilliseconds()

Propiedades de nodo (DOM)
attributes
baseURI
childNodes
firtsChild
lastChild
nodeName
nodeType
ownerDocument
parentNode

Métodos de nodo
appendChild()
removeChild()
cloneNode()
insertBefore()
isEqualNode()

Métodos de elementos (etiquetas)
getAttribute()
getElementsByTagName()
getElementsById()
getElementsByClass()
*/

window.onload = () => {
    // Comentario de una linea
    /*
    Comentario multilinea
    */

    //Declaración de variables
    var unaVariable = 'Soy una cadena';
    let nuevaVariable = 54;
    const UNA_CONSTANTE = 3.1416;

    // Objeto
    let = {nombre: "Jhonatan", apellido:"Barrera"};

    //Array
    let ciudades = ['Pereira', 'Manizales', 'Armenia'];

    console.log(ciudades);
    ciudades.pop();
    console.log(ciudades);
    ciudades.push('Bogota');
    console.log(ciudades);
    ciudades.shift();
    console.log(ciudades);
    ciudades.unshift('Pereira');
    console.log(ciudades.join('-'));

    //Modulo
    console.log(5%2);

    //Incremento y Decremento
    let acumulador = 0;
    acumulador++;
    acumulador++;
    console.log(acumulador);
    acumulador--;
    console.log(acumulador)

    //Operador ternario
    let ternario = acumulador == 1 ? 'V' : 'F';
    console.log(ternario)

    //Comparacion no exacta
    console.log(5=='5');
    console.log(7!="7");

    //Comparacion exacta
    console.log(5==='5');
    console.log(7!=="7");

    //Ciclos
    //for
    console.log('For: ');
    for (let i=0; i<5; i++) {
        console.log(i);
    }
    //while
    let loop = true;
    let contador = 0;
    console.log('while: ');
    while (loop) {
        console.log(contador)
        contador++;
        if (contador == 5) {
            loop = false;
        }
    }
    //do-while
    loop = true;
    contador = 0;
    console.log('do-while: ');
    do {
        contador++;
        if (contador == 2) {
            continue;
        }
        console.log(contador)
        if (contador == 5) {
            loop = false;
        }
    } while (loop)

    //Dates
    console.log(Date());
    let fecha = new Date('2021-09-10');
    console.log(fecha);
    console.log(fecha.getDay());
    console.log(fecha.getFullYear);

    //Funciones
    function miFuncion() {
        console.log('Hola, soy una funcion!');
    }
    miFuncion();

    // Fat Array Function
    const SUMA = (num1, num2) => {
        return num1 + num2;
    }
    console.log(SUMA(2,3));

    const RESTA = (num1, num2) => num1 - num2;
    console.log(RESTA(10,3));
}
