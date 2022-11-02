/*Escribir un programa que detecte el cupón que tiene el usuario
Bronce se le hará un descuento del 5 %
Plata se le hará un descuento del 10%
Oro se le hará un descuento del 20%
Platino se le hará el descuento del 25%
-El usuario introduce el precio primero y después el cupón
-El programa debe mostrar el precio original y el precio con el descuento aplicado
-También debe mostrar el mensaje "El cupón no es válido" en caso de que sea un 
 cupón equivocado*/

let precio = Number(prompt("Introduce el precio"));
let cupón = String(prompt("Introduce el porcentaje de descuento"));

let precioTotal = function (precio, cupón) {
    let calculo = precio - (precio * (cupón/100) );
    return calculo;  
};
document.write("")*/


switch (cupón) {
    case 5:
        document.write("");
        break;
        };
    case 10:
        document.write("");
        break;
    case 20:
        document.write("");
        break;
    case 25:
        document.write("");
        break;
    default:
        document.write("El cupón no es válido")
        break;
