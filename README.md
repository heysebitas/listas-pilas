# Ejercicios (colas y pilas)

[![Ejercicio1](https://i.imgur.com/MoNvEbM.png)](https://i.imgur.com/MoNvEbM.png)

[![Ex4](https://i.imgur.com/MoNvEbM.png)](https://i.imgur.com/PVqDLPj.jpeg)


## Js del ejercicio 1

```js
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
```
[![Gif1](https://i.imgur.com/Bog0Cr6.gif)](https://i.imgur.com/Bog0Cr6.gif)


## Js del ejercicio 2
[![Ejercicio2](https://i.imgur.com/ica8mYo.png)](https://i.imgur.com/ica8mYo.png)


```js
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
```
[![Gif](https://i.imgur.com/ERGREXQ.gif)](https://i.imgur.com/ERGREXQ.gif)


## Ejercicio 5
[![Ej5](https://i.imgur.com/l1KxwSX.png)](https://i.imgur.com/l1KxwSX.png)

[![Cuaderno5](https://i.imgur.com/8UMEsGm.jpeg)](https://i.imgur.com/8UMEsGm.jpeg)

## Js ejercicio 5
```js
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
```

[![Gif5](https://i.imgur.com/zRtpYKa.gif)](https://i.imgur.com/zRtpYKa.gif)