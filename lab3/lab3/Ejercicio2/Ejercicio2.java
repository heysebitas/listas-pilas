import java.util.*;

public class Ejercicio2 {

    // Invierte la cola sin estructuras auxiliares (recursión)
    public static void invertirCola(Queue<Integer> cola) {
        if (cola.isEmpty()) return;
        int dato = cola.poll();
        invertirCola(cola);
        cola.add(dato);
    }

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Cola original: " + cola);
        invertirCola(cola);
        System.out.println("Cola invertida: " + cola);
    }
}
