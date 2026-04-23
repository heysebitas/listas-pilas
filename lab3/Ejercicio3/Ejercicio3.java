import java.util.*;

public class Ejercicio3 {

    // Imprime las últimas 21 temperaturas en orden inverso y calcula su promedio
    public static void medicionesHospital(Stack<Double> mes) {
        double suma = 0;
        System.out.println("Ultimas 3 semanas en orden inverso:");
        for (int i = 0; i < 21; i++) {
            double temp = mes.pop();
            suma += temp;
            System.out.print(temp + " ");
        }
        System.out.println("\nPromedio de las 21 temperaturas: " + (suma / 21));
    }

    public static void main(String[] args) {
        Stack<Double> mes = new Stack<>();

        // Simulamos 28 días de temperaturas (semana 1 al fondo, semana 4 arriba)
        double[] temps = {
            36.5, 37.0, 36.8, 37.2, 36.9, 37.1, 36.7, // semana 1
            37.3, 36.6, 37.0, 36.8, 37.4, 37.1, 36.5, // semana 2
            37.2, 36.9, 37.0, 37.5, 36.8, 37.3, 37.1, // semana 3
            36.7, 37.2, 37.0, 36.9, 37.4, 37.1, 36.8  // semana 4
        };

        for (double t : temps) mes.push(t);

        System.out.println("Total de dias almacenados: " + mes.size());
        medicionesHospital(mes);
    }
}
