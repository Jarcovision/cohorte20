
// SWITCH evalúa OPCIONES específicas
// NO puede evaluar RANGOS
// NO puede utilizar OPERADORES LOGICOS

let día = 1;

switch (día) {
    case 1:
        document.write("Lunes");
        break;
    case 2:
        document.write("Martes");
        break;
    case 3:
        document.write("Miércoles");
        break;
    case 4:
        document.write("Jueves");
        break;
    case 5:
        document.write("Viernes");
        break;
    case 6:
        document.write("Sábado");
        break;
    case 7:
        document.write("Domingo");
        break;
    default:
        document.write("No es un día válido")
        break;
}
