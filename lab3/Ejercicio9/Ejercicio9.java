import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        // Estructura: Lista de Filas > Lista de Columnas > Pila de Contenedores
        LinkedList<LinkedList<Stack<String>>> bodega = new LinkedList<>();
        
        // INICIALIZAR
        for (int f = 0; f < 2; f++) {
            LinkedList<Stack<String>> fila = new LinkedList<>();
            for (int c = 0; c < 2; c++) {
                fila.add(new Stack<>());
            }
            bodega.add(fila);
        }

        // ALMACENAMIENTO DINÁMICO (Llenamos 16 contenedores: 2 filas x 2 col x 4 alto)
        int contador = 1;
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                for (int h = 0; h < 4; h++) {
                    String codigo = String.format("%04d", contador++);
                    bodega.get(f).get(c).push(codigo);
                }
            }
        }

        // RETIRAR CONTENEDOR (Ejemplo: el "0002" que está debajo en la fila 0, col 0)
        String objetivo = "0002";
        System.out.println("Buscando y retirando: " + objetivo);
        
        boolean encontrado = false;
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                Stack<String> pila = bodega.get(f).get(c);
                Stack<String> aux = new Stack<>();
                
                // Buscar en la pila usando una pila auxiliar
                while (!pila.isEmpty()) {
                    String actual = pila.pop();
                    if (actual.equals(objetivo)) {
                        System.out.println("Ubicación: Fila " + f + ", Col " + c);
                        encontrado = true;
                        break;
                    }
                    aux.push(actual);
                }
                
                // Regresar los que no eran el objetivo
                while (!aux.isEmpty()) {
                    pila.push(aux.pop());
                }
                if (encontrado) break;
            }
            if (encontrado) break;
        }

        if (!encontrado) System.out.println("Contenedor no existe");

        // MOSTRAR CONTEO FINAL
        System.out.println("\nCONTEO POR POSICIÓN:");
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.println("F" + f + " C" + c + ": " + bodega.get(f).get(c).size() + " cont.");
            }
        }
    }
}
