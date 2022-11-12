let constructor = function() {

    // declarando el objeto
    let persona = {
        nombre: "José",
        apellido: "Sotelo",
        
        get nombre0() { // get no lleva parámetros
            return this.nombre;
        },
        set nombre0(nombre1) {
            this.nombre = nombre1;
        }
    };
    return persona;
};

let p1 = new constructor();
p1.nombre = "Luis";
console.log(p1.nombre);
let obj = new Object;
