/* CONTROL DE FLUJO */
// Evalúa RANGOS DE VALORES
/*
let edad = Number(prompt("Escribe tu edad"));

if (edad >= 18) {
    document.write("Eres mayor de edad");
} else if ( (edad <= 17) && (edad >= 16) ) {
    document.write("No eres mayor de edad");
} else if ( (edad <= 15) && (edad >= 12) ) {
    document.write("Te falta, chavo");
} else if (edad < 0 ) {
    document.write("Este es un número negativo");
} else {
    document.write("Estás bien mecate");
}

console.log(isNaN(edad));
console.log(typeof edad);


// Mostrará el día de la semana
let día = 4;

if (día === 1) {
    document.write("Lunes")
} else if (día === 2) {
    document.write("Martes")
} else if (día === 3) {
    document.write("Miércoles")
} else if (día === 4) {
    document.write("Jueves")
} else if (día === 5) {
     document.write("Viernes")
} else if (día === 6) {
    document.write("Sábado")
} else if (día === 7) {
    document.write("Domingo")
} else {
    document.write("Día no válido")
}
*/

// OPERADOR TERNARIO (Elvis)
let edad = 19;

let mensaje = edad >= 16 ? "Eres mayor de edad" : "No eres mayor de edad";

console.log(mensaje);

console.log(`Por mis años ${edad  >= 18 ? "soy mayor de edad" : "no soy mayor de edad"}`);