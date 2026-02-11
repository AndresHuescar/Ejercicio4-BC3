import java.util.ArrayList;
import java.util.HashSet;

public class MainHashSetPalabra {

    public static void main(String[] args) {

        // Creo una lista de palabras (puede contener repetidas)
        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("java");
        palabras.add("python");
        palabras.add("java");
        palabras.add("c++");
        palabras.add("python");
        palabras.add("javascript");

        // Creo un HashSet para guardar solo palabras únicas
        HashSet<String> palabrasUnicas = new HashSet<>();

        // Añado todas las palabras al HashSet
        // add() -> Añade un elemento al conjunto; no lo inserta si ya existe (sin duplicados).
        palabrasUnicas.addAll(palabras);

        // Muestrar las palabras únicas
        System.out.println("Palabras únicas:");
        for (String palabra : palabrasUnicas) {
            System.out.println(palabra);
        }

        // HashSet no permite duplicados, por eso solo aparecen palabras únicas en el resultado
    }
}
