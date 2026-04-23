import java.util.*;

public class Ejercicio6 {

    static Queue<String> alta = new LinkedList<>();
    static Queue<String> baja = new LinkedList<>();

    // Muestra el estado actual de ambas colas
    public static void mostrarEstado() {
        System.out.println("  Alta prioridad: " + alta);
        System.out.println("  Baja prioridad: " + baja);
        System.out.println();
    }

    // Agrega una tarea según su prioridad
    public static void agregarTarea(String tarea, boolean esAlta) {
        if (esAlta) alta.add(tarea);
        else baja.add(tarea);
        System.out.println("+ Agregada [" + (esAlta ? "ALTA" : "BAJA") + "]: " + tarea);
        mostrarEstado();
    }

    // Extrae la siguiente tarea (primero alta, luego baja)
    public static void extraerTarea() {
        if (!alta.isEmpty()) {
            System.out.println("- Extraida [ALTA]: " + alta.poll());
        } else if (!baja.isEmpty()) {
            System.out.println("- Extraida [BAJA]: " + baja.poll());
        } else {
            System.out.println("No hay tareas pendientes.");
        }
        mostrarEstado();
    }

    public static void main(String[] args) {
        agregarTarea("Revisar servidor",   true);
        agregarTarea("Actualizar informe", false);
        agregarTarea("Corregir bug critico", true);
        agregarTarea("Enviar correo",      false);

        extraerTarea();
        extraerTarea();
        extraerTarea();
    }
}
