class Persona { // De Object (implícito) se desprenden todas las demmás clases
    constructor(nombre, apellido) {
        this._nombre = nombre; // Se acostumbra poner un _antes del MÉTODO
        this._apellido = apellido;
    }

    set nombre(nombre) { // El nomre de set es un MÉTODO
        this._nombre = nombre;
    }
    set apellido(apellido) { // El apellido de set es un MÉTODO
        this._apellido = apellido;
    }
    nombreCompleto() {
        return this._nombre + " " + this._apellido;
    }
    toString() {
        return this.nombreCompleto();
    }
}

class Empleado extends Persona {
    constructor(nombre, apellido, empresa) {
        super(nombre, apellido); // SUPER llama un métedo del objeto padre (herencia)
        this._empresa = empresa;
    }
    set empresa(empresa) {
        this._empresa = empresa;
    }
    get empresa() {
        return this._empresa;
    }
    nombreCompleto() { // SOBREESCRITURA el método de PERSONA (padre)
        return super.nombreCompleto() + " " + this._empresa;
    }
}

let p1 = new Persona("José", "Sotelo");
console.log(p1.nombreCompleto());
console.log(p1.toString());

let e1 = new Empleado("Juan", "Pérez", "Coppel");
console.log(e1.nombreCompleto());
console.log(e1.toString());