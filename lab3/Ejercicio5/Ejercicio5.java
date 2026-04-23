import java.util.*;

public class Ejercicio5 {

    public static void ejercicio5Transmilenio(Scanner sc) {
        Queue<String> ida = new LinkedList<>();
        Stack<String> vuelta = new Stack<>();

        System.out.print("Cantidad de estaciones: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Estacion " + (i + 1) + ": ");
            String estacion = sc.nextLine();
            ida.add(estacion);
            vuelta.push(estacion);
        }

        System.out.println("\nCamino de IDA:   " + ida);
        System.out.println("Camino de VUELTA: " + vuelta);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejercicio5Transmilenio(sc);
        sc.close();
    }
}
