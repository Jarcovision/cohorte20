// La declaración de las variables debe ir al inicio del documento

const título = document.getElementById("título");
const párrafo = document.getElementsByClassName("párrafo");

título.textContent = "Hola.";
párrafo[0].innerHTML = "Soy un párrafo.";

console.log(título.textContent);
console.log(párrafo[1]);

párrafo[1].style.color = "red";
párrafo[1].style.backgroundColor = "black";
// Aunque se quieran cambiar cosas de HTML o CSS, se debe respetar la sintaxis de JavaScript

párrafo[0].classList.add("coloresFeos");


// Crear elementos HTML
const padre = document.getElementById("padre");
const enlace = document.createElement("a"); // se usa para crear elementos 
enlace.href = "https://google.com";
enlace.textContent = "Ir a Google.";

console.log(enlace);

//document.body.appendChild(enlace); //Los elementos agregados con este método se colocarán hasta el final de la zona llamada

//document.body.insertAdjacentElement("beforeend", enlace);

padre.appendChild(enlace)

console.log(document.body);