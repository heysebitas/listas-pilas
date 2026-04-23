import java.util.*;

public class Ejercicio3_Conjunto {
    public static void main(String[] args) {
        char[] letras = {'A','B','C','D','E','F','G'};

        LinkedList<LinkedList<LinkedList<String[]>>> conjunto = new LinkedList<>();

        for (int t = 0; t < 7; t++) {
            LinkedList<LinkedList<String[]>> torre = new LinkedList<>();
            for (int p = 1; p <= 10; p++) {
                LinkedList<String[]> piso = new LinkedList<>();
                for (int v = 1; v <= 6; v++) {
                    String codigo = letras[t] + "-" + String.format("%02d", p) + v;
                    piso.add(new String[]{codigo, "No vendida"});
                }
                torre.add(piso);
            }
            conjunto.add(torre);
        }

        // VENDER VIVIENDA
        String objetivo = "E-093";
        System.out.println("Buscando y vendiendo: " + objetivo);

        boolean encontrada = false;
        for (int t = 0; t < 7; t++) {
            for (int p = 0; p < 10; p++) {
                for (String[] vivienda : conjunto.get(t).get(p)) {
                    if (vivienda[0].equals(objetivo)) {
                        System.out.println("Ubicacion: Torre " + letras[t] + ", Piso " + (p + 1));
                        vivienda[1] = "Vendida";
                        encontrada = true;
                        break;
                    }
                }
                if (encontrada) break;
            }
            if (encontrada) break;
        }

        if (!encontrada) System.out.println("Vivienda no existe");

        // ESTADO TORRE E PISO 9
        System.out.println("\nEstado Torre E, Piso 9:");
        for (String[] vivienda : conjunto.get(4).get(8)) {
            System.out.println(vivienda[0] + ": " + vivienda[1]);
        }
    }
}
