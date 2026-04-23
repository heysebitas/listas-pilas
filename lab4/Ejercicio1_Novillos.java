import java.util.*;

public class Ejercicio1_Novillos {
    public static void main(String[] args) {
        Random random = new Random();

        LinkedList<Integer> corral1 = new LinkedList<>();
        Stack<Integer> corral2 = new Stack<>();
        Stack<Integer> corral3 = new Stack<>();

        for (int i = 0; i < 60; i++) {
            corral1.add(250 + random.nextInt(351));
        }

        int sumaC1 = 0;
        for (int p : corral1) sumaC1 += p;
        System.out.println("Corral 1 inicial - Total: " + corral1.size() + ", Promedio: " + (sumaC1 / corral1.size()) + " kg");

        LinkedList<Integer> noSeleccionados = new LinkedList<>();
        while (!corral1.isEmpty()) {
            int peso = corral1.removeFirst();
            if (peso >= 280 && peso <= 400) {
                corral2.push(peso);
            } else if (peso >= 401 && peso <= 500) {
                corral3.push(peso);
            } else {
                noSeleccionados.add(peso);
            }
        }
        corral1 = noSeleccionados;

        int sumaC2 = 0;
        for (int p : corral2) sumaC2 += p;
        System.out.println("Corral 2 - Total: " + corral2.size() + ", Promedio: " + (corral2.isEmpty() ? 0 : sumaC2 / corral2.size()) + " kg");

        int sumaC3 = 0;
        for (int p : corral3) sumaC3 += p;
        System.out.println("Corral 3 - Total: " + corral3.size() + ", Promedio: " + (corral3.isEmpty() ? 0 : sumaC3 / corral3.size()) + " kg");

        int sumaC1Final = 0;
        for (int p : corral1) sumaC1Final += p;
        System.out.println("Corral 1 final - Total: " + corral1.size() + ", Promedio: " + (corral1.isEmpty() ? 0 : sumaC1Final / corral1.size()) + " kg");

        int camiones2 = (int) Math.ceil(corral2.size() / 10.0);
        int camiones3 = (int) Math.ceil(corral3.size() / 10.0);
        System.out.println("Camiones Corral 2: " + camiones2);
        System.out.println("Camiones Corral 3: " + camiones3);
    }
}
