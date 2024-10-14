import java.util.Arrays;
import java.util.List;

public class ejercicio9 {
    public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(2, 7, 4, 9);

            // Función lambda para calcular el producto
            int producto = numeros.stream()
                    .reduce(1, (a, b) -> a * b);

            System.out.println("El producto de los números es: " + producto);
        }
}
