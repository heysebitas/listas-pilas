import java.util.*;

public class Ejercicio7 {

    // Funcion1: determina si C1 es el inverso de P1
    public static boolean esInverso(Stack<Integer> p1, Queue<Integer> c1) {
        if (p1.size() != c1.size()) return false;

        Stack<Integer> copiaP1 = new Stack<>();
        copiaP1.addAll(p1);

        Queue<Integer> copiaC1 = new LinkedList<>(c1);

        while (!copiaP1.isEmpty()) {
            if (!copiaP1.pop().equals(copiaC1.poll())) return false;
        }
        return true;
    }

    // Funcion2: crea C1 con elementos de P1 que NO están en P2
    public static Queue<Integer> diferenciaPilas(Stack<Integer> p1, Stack<Integer> p2) {
        Queue<Integer> c1 = new LinkedList<>();
        for (Integer x : p1) {
            if (!p2.contains(x)) c1.add(x);
        }
        return c1;
    }

    public static void main(String[] args) {
        // Funcion1
        Stack<Integer> p1 = new Stack<>();
        p1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        Queue<Integer> c1 = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));

        System.out.println("P1: " + p1);
        System.out.println("C1: " + c1);
        System.out.println("C1 es inverso de P1: " + esInverso(p1, c1));

        // Funcion2
        Stack<Integer> p2 = new Stack<>();
        p2.addAll(Arrays.asList(3, 4, 5));

        Queue<Integer> resultado = diferenciaPilas(p1, p2);
        System.out.println("\nP2: " + p2);
        System.out.println("Elementos de P1 que no estan en P2: " + resultado);
    }
}
