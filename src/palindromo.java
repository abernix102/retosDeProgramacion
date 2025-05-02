import java.util.*;

public class palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el palindromo:");
        String tWord = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");
        String reverseWord = new StringBuilder(tWord).reverse().toString();
        if(tWord.equals(reverseWord)){
            System.out.println("Es un palindromo");
        }else {
            System.out.println("no es un palindromo");
        }
    }
}
/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
 * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 * el metodo Arrays.Tostring convierte el array de caracteres en una cadena de texto no en un array de caracteres xd
 * StringBuilder tiene el metodo reverse aparte nos permite cambiar el valor porque es mutable lo que nos permite modificar
 * la cadena sin crear un nuevo objeto ahorrando espacio en memoria del objeto.
 * el resultado nos da un StringBuilder pero para compararlo con tword necesitamos un String por eso usarmo ToString para hacer la comparacion mas natural.
 */