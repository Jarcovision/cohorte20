/*const foo = () => console.log("First");
const bar = () => setTimeout(() => console.log("Second"), 500);
const baz = () => console.log("Third");

bar();
foo();
baz();*/

/*const nombre = () => {
    const nombres = ["Luis", "Pedro", "Juan"];
    setTimeout(() => {
    return nombres
    }, 3000); // 30 segundos de espera   
}

console.log(nombre()); // Muestra undefined porque el console.log se ejecuta antes que la funcion setTimoeut*/


const nombre = () => {
    const nombres = ["Luis", "Pedro", "Juan"];
    /*return new Promise((resolve, reject) => {    // "resolve" - proceso exitoso
        return setTimeout(() => {
            if(true) {
                resolve(nombres);
            } else {
                reject("No  hay nombres");
            }        // "reject" - proceso NO exitoso
        }, 3000);
    });
}
nombre().then(nombres => console.log(nombres));
console.log(nombre());*/
}


// Async & await
// async function obtenerNombre (en caso de que lo hagamos on una declaración de función normal)
const obtenerNombre = async () => {
    
    try {
        let nombres = await nombre();
        console.log(nombres);
    } catch (eror) {
        alert(error);
    }
}
obtenerNombre();


/*const url = "https://pokeapi.co/api/v2/pokemon/1";
const pokédex = () => {
    fetch(url)
        .then(datos => datos.json()).then(pokémon => console.log(pokémon)).catch(error => console.log(error))
};

pokédex();*/


const cartaPokémon = document.getElementById("pokemon");
const nombrePokémon = document.getElementById("nombre");
const imagen = document.getElementById("img");
const form = document.getElementById("form");

const url = `https://pokeapi.co/api/v2/pokemon/${numero}`;

const pokédex = async (numero) => {
    try {

        const respuesta = await fetch(url);
        const pokémon = await respuesta.json();

        console.log(pokémon.name);
        
        const datos = {
            nombre: pokémon.name,
            imagen: pokémon.sprites.other['official-artwork'].front_default
        }
        
        nombrePokémon.textContent = datos.nombre;
        imagen.innerHTML = `
        <img src="${datos.imagen}" alt="Imágen de ${datos.name}" width=250>
        `

    } catch (error) {
        
    }
}

form.addEventListener("submit", (evento) => {
    
    evento.preventDefault();
    const valor = document.getElementById("idP").value;
    console.log(valor);
    
    pokédex(valor);
    //console.log(evento.target);

    form.reset();
});

// PREGUNTAR EN QUÉ LÍNEA SE PUSO LO DE PROMESAS ENCADENADAS