let estudiante = {
    nombre: "José",
    edad: 30,
    datos: function() { // FUNCIÓN ANÓNIMA DENTRO del OBJETO es un MÉTODO
        let saludo = "Hola, " + this.nombre + ". Tú tienes " + this["edad"] + " años.";
        console.log(saludo); 
        // se utilizó THIS para referirnos al objeto en turno (es una buena  práctica)
    }
};
estudiante.datos();


let constructor = function() { //dentro del CONSTRUCTOR está el OBJETO
    let objPersona = {
        nombre: "Juan",
        nss: 1234,
        datosPersona: function() { // MÉTODO del OBJETO
            let msj = "Eres " + this["nombre"] + ". El número de nss es: " + this.nss;
            console.log(msj);
        },
        otroMetodo: function(parametro) {
            let numero = 8;
            console.log("La suma es " + (numero + parametro));
        }  
    };
    return objPersona;
}
let varObjReg = new constructor(); // incluir NEW es la forma clásica de implementación
varObjReg.datosPersona();
varObjReg.otroMetodo(5);