//propiedad de arrays

//lenght()
const frutas = ["pera", "manzana", "guayaba", "plátano"];
console.log(frutas);
console.log(frutas.length);

//push() agrega un elemento al final y devuelve la nueva longitud
frutas.push("sandía");
console.log(frutas);

//unshift() elimina el primer elemento y devuelve la nueva longitud
frutas.unshift("guanábana");
console.log(frutas);

//pop() elimina el último elemento y lo devuelve
let elemento = frutas.pop();
console.log(frutas);
console.log(elemento);

//shift() elimina el primer elemento y lo devuelve
let elemento2 = frutas.shift();
console.log(frutas);
console.log(elemento2);

frutas[0];
/*indexof()  regresa la primera posición donde aparezca el elemento buscado, el cual debe escribirse correctamente*/
console.log(frutas.indexOf("manzana"));
console.log(frutas.indexOf("plátano"));

//reverse() invierte el orden del array
frutas.reverse()
console.log(frutas);

frutas.reverse()
console.log(frutas);
/*Para invertir el orden de arreglos internos
se debe usar [i] para acceder a ellos*/

//sort() ordera el array en orden alfabético
frutas.sort();
console.log(frutas);

//Los números se acomodan de acuerdo al primer elemento
const numeros = [2, 34, 554, 117, -5];
numeros.sort();
console.log(numeros);

//Para ordenarlos de forma ascendente a menos que usemos lo siguiente
numeros.sort((a, b) => a - b);
console.log(numeros);