/*  
De FORMA CLÁSICA:
Un objeto es una instancia
Instancia es la llamada de una clase 
*/

class OperacionesAritméticas { // Los nombres de CLASES comienzan con mayúscula
    número0 = 0; // Dentro de clases no se usan let ni const
    número1 = 0; // Se les asigna valor de 0 como estado de inicio
    constructor (valor0, valor1) {
        this._número0 = valor0;
        this._número1 = valor1;
    }
    sumar(a, b) { // Dentro de clases no se usa function
        return a + b;
    }
    set número0 (num0) {
        this._número0 = num0; // set no lleva return
    }
    set número1 (num1) {
        this._número1 = num1; // set no lleva return
    }
    get número0 () { // get no lleva parámetros
        return this._número0;
    }
    get número1 () { // get no lleva parámetros
        return this._número1;
    }
}
// Cuando se declara un objecto y se llama una clase se llama INSTANCIA
let obj1; // 1. Se declara el objeto 
obj1 = new OperacionesAritméticas(10, 11); // 2. Se crea el objeto
console.log(obj1._número0); // 10
console.log(obj1._número1); // 11
console.log("Obj 1: " + obj1.sumar(obj1._número0, obj1._número1)); // 3. Se llama la instancia

let obj2 = new OperacionesAritméticas(2, 7);
obj2._número0 = 20;
obj2._número1 = 21;
console.log("Obj 2: " + obj2.sumar(obj2._número0, obj2._número1));

