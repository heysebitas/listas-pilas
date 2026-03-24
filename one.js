let arreglo1 = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

function mostrarInvertido(pila) {
    // caso base
    if (pila.length === 0) return "Yuca;"

    // caso recursivo
    //
    let elemento = pila.pop();

    console.log(elemento);
    
    mostrarInvertido(pila);
}

mostrarInvertido(arreglo1);

// Verificación de que la pila quedó vacía
console.log("Estado final de la pila:", arreglo1); 
