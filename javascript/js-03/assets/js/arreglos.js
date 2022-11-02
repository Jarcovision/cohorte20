const numeros = [2, 4, 6, 80, 123];
let suma = 0;

//recorre todo el arreglo y ejecuta el código que le indiquemos sobre los valores guardados

numeros.forEach(function sumar(elemento) {
    suma = suma + elemento;
    //return suma;
    console.log(suma);
});


numeros.forEach((el, índice, arreglo) => {
    console.log(el, índice, arreglo);
});
console.log(numeros);


let nuevoArr = numeros.map((el) => {
    return el * el;
});
console.log(nuevoArr);

const frutas = ["papaya", "manzana", "manzana", "uva"];
let frutaFiltrada = frutas.filter((fruta) => fruta.length > 3);
console.log(frutaFiltrada);