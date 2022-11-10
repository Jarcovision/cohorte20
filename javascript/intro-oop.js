/*let persona1 = new Object(); // Forma implícita de crear un objeto
persona1.edad = 23;
console.log(persona1);
console.log(persona1.edad); */

let persona = {  // Forma explícita de crear un objeto (es la más usual)
    nombre: "Juan",
    apellido: "Pérez",
    nombreCompleto: function() {
        return "El nombre es " + this.nombre + " " + this.apellido;
    };
}
// Spintaxis de FOR IN:  for (variable in objeto)
for (nombrePropiedad in persona) { // nombrePropiedad es igual a i = 0
   // console.log(nombrePropiedad); 
    console.log(nombrePropiedad + ": " + persona[nombrePropiedad]);
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());
console.log(persona["apellido"]);
persona.tel = "5544332211"; // se creó la propiedad tel
console.log(persona); // se imprime el objeto actualizado, CON la propiedad tel
console.log(persona.tel);
for (nombrePropiedad in persona) { 
     console.log(nombrePropiedad + ": " + persona[nombrePropiedad]);
 }
delete persona.tel; // se elimina la propiedad tel
console.log(persona); // se imprime el objeto actualizado, SIN la propiedad tel
let personaArreglo = Object.values(persona);
console.log(personaArreglo);
let personaString = JSON.stringify(persona);
console.log(personaString);