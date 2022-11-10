/*  
De FORMA CLÁSICA:
Un objeto es una instancia
Instancia es la llamada de una clase 
*/

class OperacionesAritméticas { // Los nombres de CLASES comienzan con mayúscula
    número0 = 0; // Dentro de clases no se usan let ni const
    número1 = 0; // Se les asigna valor de 0 como estado de inicio

    constructor (valor0, valor1) {
        this.número0 = valor0;
        this.número1 = valor1;

    }

    sumar(a, b) { // Dentro de clases no se usa function
        return a + b;
    }
    set número0 (num0) {
        this.número0 = num0;
    }
    set número1 (num1) {
        this.número1 = num1;
    }
    get número0 () { // get no lleva parámetros
        return this.número0;
    }
    get número1 () { // get no lleva parámetros
        return this.número1;
    }
}
// Cuando se declara un objecto y se llama una clase se llama INSTANCIA
let obj1; // 1. Se declara el objeto 
obj1 = new OperacionesAritméticas(10, 11); // 2. Se crea el objeto
console.log(obj1.número0); // 10
console.log(obj1.número1); // 11
console.log("Obj 1: " + obj1.sumar(obj1.número0, obj1.número1)); // 3. Se llama la instancia

let obj2 = new OperacionesAritméticas(2, 7);
obj2.número0 = 20;
obj2.número1 = 21;
console.log("Obj 2: " + obj2.sumar(obj2.número0, obj2.número1));

