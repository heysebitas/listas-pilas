import java.util.*;

public class Ejercicio1 {

    // Elimina el dato de la cola sin estructuras auxiliares (recursión)
    public static void eliminarDato(Queue<Integer> cola, int dato) {
        if (cola.isEmpty()) return;
        int actual = cola.poll();
        eliminarDato(cola, dato);
        if (actual != dato) cola.add(actual);
    }

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>(Arrays.asList(10, 20, 30, 20, 40));
        int dato = 20;

        System.out.println("Cola original: " + cola);
        eliminarDato(cola, dato);
        System.out.println("Cola luego de eliminar " + dato + ": " + cola);
    }
}
