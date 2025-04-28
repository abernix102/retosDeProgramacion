import java.util.Scanner;

public class anagrama {
    public static boolean anagrama(String entre1, String entre2) {
        int contador = 0;
        if (entre1.length() != entre2.length()) {
            return false;
        }
        char[] caracteres2 = entre2.toCharArray();

        for (int i = 0; i < entre1.length(); i++) {
            for (int j = 0; j < caracteres2.length; j++) {
                if (entre1.charAt(i) == caracteres2[j]) {
                    contador++;
                    caracteres2[j] = ' ';
                    break;
                }
            }
        }
        return contador == entre1.length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese la primera palabra: ");
        String primeraPalabra = scanner.nextLine();

        System.out.println("Por favor, ingrese la segunda palabra: ");
        String segundaPalabra = scanner.nextLine();

        System.out.println(anagrama(primeraPalabra, segundaPalabra));
    }
}
