let arr = [
    [1, 2, 3], // 0
    [4, 5, 6], // 1
    [7, 8, 9] // 2
];
//console.log(arr[0][2]);
/*
let suba = [1, 2, 3];
let subb = [4, 5, 6];
let subc = [7, 8, 9];
let arregloS = [suba, subb, subc];

console.log(arregloS[0][2], subb, subc);
*/

// BUCLES FOR
for (let i = 0; i < 2; i++) {
    console.log(arr[i]);
}
/* [ 1, 2, 3 ]
[ 4, 5, 6 ] */

for (let i = 0; i <= 2; i++) {
    console.log(arr[i]);
}
/* [ 1, 2, 3 ]
[ 4, 5, 6 ]
[ 7, 8, 9 ] */

/*
for (let fila = 0; fila <= 2; fila++) {
    for (let columna = 0; columna <= 2; columna++) {
        console.log(arr[fila][columna]);
    }
    console.log("_______________");
}
*/

// BUCLES WHILE
let contador = 0; // contará de 1 a 10
while (contador < 10) {
    contador = contador + 1;
    console.log(contador);
}

let contador1 = 0; // contará de 0 a 9
while (contador1 < 10) {
    console.log(contador1);
    contador1 = contador1 + 1;
}


let contador2 = 0; // contará de 0 a 10
do {
    console.log(contador2);
    contador2++;
} while (contador2 <= 10);


let cadena = "hola";
console.log(cadena.length);

/*
let fila = 0;
while (fila <= 2) {
    for (let columna = 0; columna <= 2; columna++) {
            console.log(arr[fila][columna]);
        }
        fila ++;
        console.log("----------");
}
*/

// BUCLES DO...WHILE
let fila = 0;
do {
    for (let columna = 0; columna <= 2; columna++) {
        console.log(arr[fila][columna]);
    }
    fila ++;
    console.log("----------");
} while (fila <= 2);