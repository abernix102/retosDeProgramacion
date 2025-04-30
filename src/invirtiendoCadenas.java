import java.util.Arrays;
import java.util.Scanner;

public class invirtiendoCadenas {
    public static void main(String[] args) {
        /*
         * Crea un programa que invierta el orden de una cadena de texto
         * sin usar funciones propias del lenguaje que lo hagan de forma automática.
         * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la palabra: ");
        String valorDeEntrada = scanner.nextLine();
        char [] caracteres = valorDeEntrada.toCharArray();
        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.print(caracteres[i]);
        }
    }
}
