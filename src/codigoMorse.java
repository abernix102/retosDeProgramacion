import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codigoMorse {
    private static final Map<Character, String> morseCode = new HashMap<>();
    static {
        // Letras
        morseCode.put('A', ".-");
        morseCode.put('B', "-...");
        morseCode.put('C', "-.-.");
        morseCode.put('D', "-..");
        morseCode.put('E', ".");
        morseCode.put('F', "..-.");
        morseCode.put('G', "--.");
        morseCode.put('H', "....");
        morseCode.put('I', "..");
        morseCode.put('J', ".---");
        morseCode.put('K', "-.-");
        morseCode.put('L', ".-..");
        morseCode.put('M', "--");
        morseCode.put('N', "-.");
        morseCode.put('O', "---");
        morseCode.put('P', ".--.");
        morseCode.put('Q', "--.-");
        morseCode.put('R', ".-.");
        morseCode.put('S', "...");
        morseCode.put('T', "-");
        morseCode.put('U', "..-");
        morseCode.put('V', "...-");
        morseCode.put('W', ".--");
        morseCode.put('X', "-..-");
        morseCode.put('Y', "-.--");
        morseCode.put('Z', "--..");

        // Números
        morseCode.put('0', "-----");
        morseCode.put('1', ".----");
        morseCode.put('2', "..---");
        morseCode.put('3', "...--");
        morseCode.put('4', "....-");
        morseCode.put('5', ".....");
        morseCode.put('6', "-....");
        morseCode.put('7', "--...");
        morseCode.put('8', "---..");
        morseCode.put('9', "----.");

        // Caracteres especiales
        morseCode.put('.', ".-.-.-");
        morseCode.put(',', "--..--");
        morseCode.put('?', "..--..");
        morseCode.put('!', "-.-.--");
        morseCode.put('/', "-..-.");
        morseCode.put('(', "-.--.");
        morseCode.put(')', "-.--.-");
        morseCode.put('&', ".-...");
        morseCode.put(':', "---...");
        morseCode.put(';', "-.-.-.");
        morseCode.put('=', "-...-");
    }
    public static void main(String[] args) {
        /*
         * Crea un programa que sea capaz de transformar texto natural a código
         * morse y viceversa.
         * - Debe detectar automáticamente de qué tipo se trata y realizar
         *   la conversión.
         * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
         *   o símbolos y dos espacios entre palabras "  ".
         * - El alfabeto morse soportado será el mostrado en
         *   https://es.wikipedia.org/wiki/Código_morse.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el texto: ");
        String textoDeEntrada = scanner.nextLine().toUpperCase();
        System.out.println(conversorMorse(textoDeEntrada));
    }

    public  static String conversorMorse(String texto){
        StringBuilder morse = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
             char caracter = texto.charAt(i);
             if(morseCode.containsKey(caracter)){
                 morse.append(morseCode.get(caracter));
             } else if (caracter == ' ') {
                 morse.append("  ");
             }
        }
        return morse.toString().trim();
    }
}
