function sumarNElementos(n, arreglo) {
    
    if (n > arreglo.length) return "yuca, indefinido";
    
    
    // Caso base
    if (n <= 0) {
        return 0;
    }

    // caso recursivo
    return arreglo[n - 1] + sumarNElementos(n - 1, arreglo);
}

// Probando con los datos del ejercicio:
const miArreglo = [2, 4, 6, 8, 10, 12];
const n = 3;

console.log(`Suma de los primeros ${n} numeros = `, sumarNElementos(n, miArreglo)); 