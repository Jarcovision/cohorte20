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
} //REVISAR ESTA FUNCIÓN

function ejemplo() {
    let valor1 = 10;
    valor1 = valor1 + 5;
    console.log("El resultado es " + valor1); 
}
ejemplo()

/*var valor2 = 3; //declaración global (fuera de alguna función)
function funcion2 {

}*/

let variableGlobal = 5; //
function funcion3() {
    let variableLocal = "El valor es: ";
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

//FUNCIONES ANÓNIMAS
let funcionAnonima = function(parametro) {
    parametro = parametro * 2;
    return parametro;
}
console.log("Llamando a la función anónima " + funcionAnonima(4));

let otraAnonima = function (día) {
    return "Hola, " + día;
} ("Lunes"); //"Lunes" es el ARGUMENTO día

console.log("El saludo es: " + otraAnonima);
//ya no se necesita el ARGUMENTO en la llamada

//FUNCIONES FLECHA
let suma = (x, y) => {return x + y};
let resultado = suma (5, 3);
console.log("El resultado de la suma es " + resultado);

let resta = (x, y) => {return x - y};
let resultado2 = resta (5, 3);
console.log("El resultado de la resta es " + resultado2);


/*Realizar una funcion (calcularPrecioTotal)
para Calcular el precio total de una compra tomando encuenta 
impuestos = 1.16, gartos de envio = 10, y como parametro el precio
donde 
precioTotal = (precio * impuesto ) + gartosEnvio;

como salida precio Total
precioTotal = calcularPrecioTotal(23.34);*/

// Función regular
function calcularPrecioTotal(precio, impuestos, gastosEnvío) {
    let precioTotal = (precio * impuestos) + gastosEnvío;
    return precioTotal;
}
let total = calcularPrecioTotal(23.34, 1.16, 10);
console.log("Costo total con función regular: " + total);

let calculoImpuestos = function (precio) {
    let porcentajeImpuestos = 16;
    let impuestos = (1 + porcentajeImpuestos/100) * precio;
    return impuestos;
} (23.34);
console.log("(función anónima) Los impuestos son: " + calculoImpuestos);

let precioConImpuestos = function (precio) {
    let porcentajeImpuestos = 16;
    let gastosEnvío = 10
    let impuestos = (1 + porcentajeImpuestos/100) * precio + gastosEnvío;
    return impuestos;
};
console.log("(función anónima) Resultado: " + precioConImpuestos(23.34));

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
} (23.34);
console.log("Anónima " + calcularPrecioTotal2);

// Función flecha
let calcularPrecioTotal3 = (precio) => {
    let impuestos = 1.16;
    let gastosEnvío = 10;
    let precioTotal = precio * impuestos + gastosEnvío;
    return precioTotal;
};
console.log("Flecha " + calcularPrecioTotal3(23.34));






