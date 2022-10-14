//alert ("funciona");

//Arreglos
let arr1 = new Array("José", 3, true);
console.log(arr1);

//notación de corchetes
console.log(arr1[2]);
console.log(arr1[0]);

//modificar o agregar valores
console.log(arr1[3]);
arr1[3] = 123;
console.log(arr1[3]);

arr1[10] = 5;
console.log(arr1);

arr1[10] = "GDL";
console.log(arr1);


const arr2 = [];
console.log(arr2);
arr2[0] = 2;
console.log(arr2);
/*aunque el array se declaró usando 'const', sí podemos
modificarlo porque se modifico el contenido del array
y no el valor del array*/

//array multidimensional (array dentro de otro array)
const arr4 = [1, "Adiós", false, [4, 10, 3]];
console.log(arr4[3][1]); //imprimirá el valor 4




