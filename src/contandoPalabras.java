import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contandoPalabras {
    public static void main(String[] args) {
        /*
         * Crea un programa que cuente cuantas veces se repite cada palabra
         * y que muestre el recuento final de todas ellas.
         * - Los signos de puntuación no forman parte de la palabra.
         * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
         * - No se pueden utilizar funciones propias del lenguaje que
         *   lo resuelvan automáticamente.
         */
        String parrafo = "El sol brillaba en el cielo, y las sombras se alargaban poco a poco. A medida que el sol subía, la luz se intensificaba, cubriendo todo con su resplandor. Todo parecía ser más brillante bajo ese sol, pero también más cálido.";
        String[] words = parrafo.toLowerCase().split("[,\\.\\?\\!\\s]+");  // Utiliza la expresión regular para separar por coma, punto, etc.
        System.out.println(Arrays.toString(words));
        List<String> palabrasYaContadas = new ArrayList<>();
        List <Integer> contadorDePalabras = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String palabraActual = words[i];
            if(!palabrasYaContadas.contains(palabraActual)){
                int contador = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if(palabraActual.equals(words[j])){
                        contador++;
                    }
                }
                if(contador > 1){
                    palabrasYaContadas.add(palabraActual);
                    System.out.println("la palabra: " + palabraActual + " se repite: " + contador);
                }
            }
            }
        }
}
