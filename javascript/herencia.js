class Persona {
    constructor (nombre, apellido) {
        this._nombre = nombre; // Se acostumbra poner un _antes del MÉTODO
        this._apellido = apellido;
    }

    set nombre (nombre) { // El nomre de set es un MÉTODO
        this._nombre = nombre;
    }
    set apellido (apellido) { // El apellido de set es un MÉTODO
        this._apellido = apellido;
    }
    nombreCompleto () {
        return this._nombre + " " + this._apellido;
    }
}

class Empleado extends Persona {
    constructor (nombre, apellido, empresa) {
        super(nombre, apellido); // SUPER llama un métedo del objeto padre (herencia)
        this._empresa = empresa;
    }
    set empresa (empresa) {
        this._empresa = empresa;
    }
    get empresa () {
        return this. empresa;
    }
}

let p1 = new Persona("José", "Sotelo");
console.log(p1.nombreCompleto());

let e1 = new Empleado ("Juan", "Pérez", "Coppel");
console.log(e1.nombreCompleto() + " " + e1._empresa);