import java.util.*;

public class Ejercicio8 {

    // Extrae de la pila todos los elementos iguales al dato y los guarda en una cola
    public static void eliminarRepetidos(Stack<Integer> pila, int dato) {
        Queue<Integer> colaRepetidos = new LinkedList<>();
        Stack<Integer> aux = new Stack<>();

        while (!pila.isEmpty()) {
            int actual = pila.pop();
            if (actual == dato) colaRepetidos.add(actual);
            else aux.push(actual);
        }

        // Restaurar pila en su orden original
        while (!aux.isEmpty()) pila.push(aux.pop());

        System.out.println("Cola de extraidos: " + colaRepetidos);
        System.out.println("Total extraidos:   " + colaRepetidos.size());
        System.out.println("Pila resultante:   " + pila);
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.addAll(Arrays.asList(3, 7, 3, 1, 3, 5, 3, 2));
        int dato = 3;

        System.out.println("Pila original: " + pila);
        System.out.println("Dato a eliminar: " + dato + "\n");
        eliminarRepetidos(pila, dato);
    }
}
