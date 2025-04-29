import java.util.Locale;
import java.util.Scanner;

public class areaPoligono {
    public static void main(String[] args) {
        /*
         * Crea una única función (importante que sólo sea una) que sea capaz
         * de calcular y retornar el área de un polígono.
         * - La función recibirá por parámetro sólo UN polígono a la vez.
         * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
         * - Imprime el cálculo del área de un polígono de cada tipo.
         */
        Scanner scanner = new Scanner(System.in);
        String tipo;
        int altura = 0;
        int base = 0;
        int lado = 0;
        System.out.println("Ingrese el tipo de polígono (triangulo, cuadrado, rectangulo): ");
        tipo = scanner.nextLine().toLowerCase();
        // Dependiendo del tipo de polígono, tomar los parámetros adecuados
        if (tipo.equals("triangulo")) {
            System.out.println("Ingrese la altura del triángulo: ");
            altura = scanner.nextInt();
            System.out.println("Ingrese la base del triángulo: ");
            base = scanner.nextInt();
        } else if (tipo.equals("cuadrado")) {
            System.out.println("Ingrese el lado del cuadrado: ");
            lado = scanner.nextInt();
        } else if (tipo.equals("rectangulo")) {
            System.out.println("Ingrese la altura del rectángulo: ");
            altura = scanner.nextInt();
            System.out.println("Ingrese la base del rectángulo: ");
            base = scanner.nextInt();
        } else {
            System.out.println("Figura no soportada por la función");
            return; // Salir si el tipo no es válido
        }
        areaDeUnPoligono(tipo, altura, base, lado);
    }


    public static void areaDeUnPoligono(String tipo,int altura,int base,int lado){
        if (tipo.equals("triangulo")) {
            int resultado = base * altura / 2;
            System.out.println("El área del triángulo es: " + resultado);
        } else if (tipo.equals("cuadrado")) {
            int resultado = lado * lado;
            System.out.println("El área del cuadrado es: " + resultado);
        } else if (tipo.equals("rectangulo")) {
            int resultado = base * altura;
            System.out.println("El área del rectángulo es: " + resultado);
        }
    }
}
