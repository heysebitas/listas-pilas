function multiplicar(a, b) {
    // Caso base cualquier número multiplicado por 0 es 0
    if (b === 0) {
        return 0; //yuca
    }

    // Caso recursivo: a + (a multiplicado por b-1)
    return a + multiplicar(a, b - 1);
}

// Pruebas
console.log(multiplicar(5, 3));  // 15 (5 + 5 + 5)
console.log(multiplicar(10, 0)); // 0
console.log(multiplicar(0, 7));  // 0