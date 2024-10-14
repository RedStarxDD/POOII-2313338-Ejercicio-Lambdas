import java.util.*;

public class ejercicio7 {
    public static void main(String[] args) {
                List<String> palabras = new ArrayList<>();
                palabras.add("platano");
                palabras.add("manzana");
                palabras.add("fresa");
                palabras.add("kiwi");
                palabras.add("uva");

                // Ordenar por longitud y luego alfabéticamente
                Collections.sort(palabras, (a, b) -> {
                    int longitudComparacion = Integer.compare(a.length(), b.length());
                    return longitudComparacion != 0 ? longitudComparacion : a.compareTo(b);
                });

                System.out.println(palabras);
    }
}
