let miNombre = "José Luis Sotelo Guadarrama";
console.log(miNombre);

function usuario() {
    let nombre = "José";
    console.log(nombre);
}
usuario();

function funcion1() {
    let valor = 2;
    valor = valor + 3;
    return valor; 
} //REVISAR ESTA FUNCIÓN por el RETURN

function ejemplo() {
    let valor1 = 10;
    valor1 = valor1 + 5;
    console.log("El resultado es " + valor1); 
}
ejemplo()

/*var valor2 = 3; //declaración global (fuera de alguna función)
function funcion2 {

}*/

let variableGlobal = 5; // Variable GLOBAL es declarada fuera de la función
function funcion3() {
    let variableLocal = "El valor es: "; // Variable LOCAL es declarada dentro de la función
    console.log(variableLocal + variableGlobal);
}
funcion3();

function funcion4(valor) {
    let numero = 6;
    numero = numero * valor;
    return numero;
}
let salida = funcion4(3);
console.log("El producto es " + salida);

//FUNCIONES ANÓNIMAS (siempre deben tener al menos un ARGUMENTO)
let funcionAnonima = function(argumento) {
    argumento = argumento * 2; // se llama al ARGUMENTO en el cuerpo de la función
    return argumento; // se retorna el ARGUMENTO con su valor actualizado
}
console.log("Llamando a la función anónima " + funcionAnonima(4));

let otraAnonima = function (día) {
    return "Hola, " + día;
} ("Lunes"); //"Lunes" es el ARGUMENTO día

console.log("El saludo es: " + otraAnonima);
//ya no se necesita el ARGUMENTO en la llamada de la variable (FUNCIÓN ANÓNIMA)

//FUNCIONES FLECHA (pueden escribirse en una sola línea si no son muy largas)
let suma = (x, y) => {return x + y};
let resultado = suma (5, 3);
console.log("(flecha) El resultado de la suma es " + resultado);

let resta = (x, y) => {return x - y};
let resultado2 = resta (5, 3);
console.log("(flecha) El resultado de la resta es " + resultado2);

/*Realizar una funcion (calcularPrecioTotal)
para Calcular el precio total de una compra tomando en cuenta: 
precio = 23.34, impuestos = 1.16, gastos de envio = 10 y como parámetro el precio
donde: precioTotal = (precio * impuesto ) + gastosEnvio;
como salida: precio Total*/

// Función regular
function calcularPrecioTotal(precio, impuestos, gastosEnvío) {
    let precioTotal = (precio * impuestos) + gastosEnvío;
    return precioTotal; // si no se incluye RETURN, dará como resultado UNDEFINED en el console.log
}
let total = calcularPrecioTotal(23.34, 1.16, 10);// se declara una nueva VARIABLE con la FUNCIÓN con valores en sus ARGUMENTOS
console.log("(función regular) Costo total: " + total);


let calculoImpuestos = function (precio) {
    let porcentajeImpuestos = 16;
    let impuestos = (1 + porcentajeImpuestos/100) * precio;
    return impuestos;
} (23.34); //el ARGUMENTO de la FUNCIÓN se añade al final de ésta
console.log("(función anónima) Los impuestos son: " + calculoImpuestos);


let precioConImpuestos = function (precio) {
    let porcentajeImpuestos = 16;
    let gastosEnvío = 10
    let impuestos = (1 + porcentajeImpuestos/100) * precio + gastosEnvío;
    return impuestos;
};
console.log("(función anónima) Costo total: " + precioConImpuestos(23.34)); //el ARGUMENTO de la FUNCIÓN se añade en la llamada de ésta

// (1 + porcentajeImpuestos/100) * precio;
// calculaPrecioTotal(precio, porcentajeImpuestos);
// calculaPrecioTotal(23.34, 16);

// function calcularPrecioTotal1(precio) {
//     let impuestos = 1.16;
//     let gastosEnvío = 10;
//     let precioTotal = (precio * impuestos) + gastosEnvío;
//     return precioTotal;
// }
// let total2 = calcularPrecioTotal1();
// console.log(total2); // muestra Nan porque el PRECIO no está asignado

// Función anónima
let calcularPrecioTotal2 = function (precio) {
    let impuestos = 1.16;
    let gastosEnvío = 10;
    let precioTotal = precio * impuestos + gastosEnvío;
    return precioTotal;
} (23.34); //el ARGUMENTO de la FUNCIÓN se añade al final de ésta
console.log("Anónima " + calcularPrecioTotal2);

// Función flecha
let calcularPrecioTotal3 = (precio) => {
    let impuestos = 1.16;
    let gastosEnvío = 10;
    let precioTotal = precio * impuestos + gastosEnvío;
    return precioTotal;
};
console.log("Flecha " + calcularPrecioTotal3(23.34)); //el ARGUMENTO de la FUNCIÓN se añade en la llamada de ésta






