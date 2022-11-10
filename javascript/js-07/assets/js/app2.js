// Forma 1 para crear elementoa en HTML
//const título = document.getElementById("título").innerHTML;

// 1. Llamar al contenedor (elemento padre)
const imagen = document.getElementsByClassName("contenedor")[0]; 
// Este método crea una lista y almacena lo elementos
console.log(imagen);

// 2. Crear el elemento
const nuevaImg = document.createElement("img");

// 3. Modificar atributos del elemento creado
nuevaImg.src = "https://placeimg.com/200/200/animals";
nuevaImg.alt = "Animal";

// 4. Insertar el elemento
imagen.appendChild(nuevaImg);


// Forma 2 para crear elementoa en HTML (es mejor porque son menos pasos y menos código)

// 1. Llamar al contenedor (elemento padre)
const imagen2 = document.getElementById("img");
console.log(imagen2);

// 2. Crear el elemento
//imagen2.textContent = Esto escribirá la ruta de la imagen (abajo en verde)
imagen2.innerHTML = `
    <img src="https://placeimg.com/200/200/arch" alt="Arquitectura"/>
`;



// Crear una lista a partir de los elementos guardados en un arreglo
// Insertar la lista en el documento para que se peda mostrar

// Forma 1
const nombres = ["Pedro", "Juan", "Sonia", "Miguel"];
const lista1 = document.getElementById("lista1");

nombres.forEach((el) => { // Función callback
    const li = document.createElement("li");
    li.textContent = el;
    lista1.appendChild(li);
});

// Forma 2
const frutas = ["Manzana", "Limón", "Pera", "Uva"];
const lista2 = document.getElementById("lista2");

frutas.forEach((el) => {
    lista2.innerHTML += `
        <li>${el}</li>
    `;

});