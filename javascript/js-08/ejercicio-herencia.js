class Persona {
    constructor(idPersona, nombre, apellido, edad) {
        this._idPersona = idPersona
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    get idPersona() {
        return this._idPersona;
    }
    get nombre() {
        return this._nombre;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }
    get apellido() {
        return this._apellido;
    }
    set apellido(apellido) {
        this._apellido = apellido;
    }
    get edad() {
        return this._edad;
    }
    set edad(edad) {
        this._edad = edad;
    }
    nombreCompleto() {
        return this._nombre + " " + this._apellido;
    }
    toString() {
        return this.nombreCompleto();
    }
}

class Empleado extends Persona {
    constructor(idPersona, nombre, apellido, edad, idEmpleado, sueldo) {
        super(idPersona, nombre, apellido, edad);
        this._idEmpleado = idEmpleado;
        this._sueldo = sueldo;
    }
    get idEmpleado() {
        return this._idEmpleado;
    }
    get sueldo() {
        return this._sueldo;
    }
    set sueldo(sueldo) {
        this._sueldo = sueldo;
    }
    // toString()
}

class Cliente extends Persona {
    constructor(idPersona, nombre, apellido, edad, idCliente, fechaRegistro) {
        super (idPersona, nombre, apellido, edad);
        this._idCliente = idCliente;
        this._fechaRegistro = fechaRegistro;
    }
    get idCliente() {
        return this._idCliente;
    }
    get fechaRegistro() {
        return this._idCliente;
    }
    set fechaRegistro(fechaRegistro) {
        this._fechaRegistro = fechaRegistro;
    }
    // toString()
}

let p1 = new Persona("José", "Sotelo");
console.log(p1.nombreCompleto());
// imprimer "Sotelo undefined"

