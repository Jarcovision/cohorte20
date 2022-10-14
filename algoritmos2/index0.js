function suma(){
    let num1 = 5;
    let num2 = 6;
    let resultado = num1 + num2;
    return (resultado);
}
console.log(suma());

function resta () {
    let num1 = 5;
    let num2 = 6;
    let resultado = (num1 - num2);
    return resultado;
}
console.log(resta());

function mult(){
    let num1 = 5;
    let num2 = 6;
    let resultado = (num1 * num2);
    return (resultado);
}
console.log(mult());

function div(){
    let num1 = 5;
    let num2 = 60;
    let resultado = (num2 / num1);
    return (resultado);
}
console.log(div());

function residuo() {
    let num1 = 2;
    let num2 = 7;
    let resultado = (num2 % num1);
    return resultado;
}
console.log(residuo())

function adicional () {
    let num1 = 7;
    num1 *= num1+ (5+3);
    return num1;
}
console.log("el número adicional es " + adicional());

function edad () {
    let miEdad = 10;
    if (miEdad >= 18) {
         console.log("Eres mayor de edad");
    } else { 
        console.log("No eres mayor de edad");
    }
}

edad()

function conjunciones() {
    let valor1 = false;
    let valor2 = false;
    if (valor1 && valor2) {
        console.log("El valor 1 y el valor 2 son verdaderos");
    } else {
        console.log("Un valor es falso");
    }
}
conjunciones();

function disjunction() {
    let valor1 = false;
    let valor2 = false;
    if (valor1 || valor2) {
        console.log("El operador OR es falso");
    } else {
        console.log("El operador OR es verdadero");
    }
}
disjunction();

function negacion() {
    let valor1 = true;
    if (!(!valor1)) {
        console.log("El valor es " + valor1);
    } else {
        console.log("El valor negado es " + valor1);
    }
}
    
negacion();