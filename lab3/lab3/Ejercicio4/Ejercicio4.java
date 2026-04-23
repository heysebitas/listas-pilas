import java.util.*;

public class Ejercicio4 {

    // Calcula total depósitos, retiros y balance final
    public static void balanceBancario(LinkedList<Double> transacciones) {
        double depositos = 0, retiros = 0;

        for (double t : transacciones) {
            if (t > 0) depositos += t;
            else retiros += Math.abs(t);
        }

        System.out.println("Total depositos: " + depositos);
        System.out.println("Total retiros:   " + retiros);
        System.out.println("Balance final:   " + (depositos - retiros));
    }

    public static void main(String[] args) {
        LinkedList<Double> transacciones = new LinkedList<>();

        // Positivos = depósitos, negativos = retiros
        transacciones.add(500.0);
        transacciones.add(-200.0);
        transacciones.add(300.0);
        transacciones.add(-150.0);
        transacciones.add(1000.0);
        transacciones.add(-50.0);

        System.out.println("Transacciones: " + transacciones);
        balanceBancario(transacciones);
    }
}
