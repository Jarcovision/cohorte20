//crear una aplicación con JS, recibir una palabra y va a regresar la palabra invertida

/*let arr = [];
let palabra = prompt("Ingresa palabra");

for (let i = 0; i<palabra.length; i++) {
    arr.unshift(palabra[i])
}
console.log(String(arr).replaceAll(",", ""));
*/

// Reintentar con .split(), .reverse(), .join()


function invertirPalabra(arr) {
    let separarPalabra = arr.split("");    
    let invertirArr = separarPalabra.reverse();
    let unirArr = invertirArr.join("");
    return unirArr;
}

invertirPalabra("hola");

function invertirCadena(cad) {
    return cad.split("").reverse().join("");
}
invertirCadena("hola");