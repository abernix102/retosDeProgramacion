import java.util.Scanner;

public class decimalABinario {
    public static void main(String[] args) {
        /*
         * Crea un programa se encargue de transformar un número
         * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el valor decimal: ");
        double decimal = scanner.nextDouble();
        binario(decimal);
    }
    public static int  enteroBinario( int valorE){
        StringBuilder binario = new StringBuilder();
        int entero = valorE;
        if(entero == 0) return  0;
        while (entero > 0 ){
            int  resto = entero % 2;
            binario.insert(0, resto);
            entero =entero / 2;
        }
        return  Integer.parseInt(binario.toString());
    }
    public  static void binario( double valor){
        if (valor == 0) {
            System.out.println("0");
            return;
        }
        int parteEntera = (int) valor;
        String binarioEntero = String.valueOf(enteroBinario(parteEntera));
        System.out.print("parte entera en binario: " + binarioEntero);
        double parteDecimal = valor - parteEntera;
        if(parteDecimal > 0){
            System.out.print(".");
            StringBuilder binarioDeciaml  = new StringBuilder();
            while (parteDecimal > 0){
                parteDecimal*= 2;
                int bit = (int) parteDecimal;
                binarioDeciaml.append(bit);
                parteDecimal-=bit;
                if(binarioDeciaml.length() > 10){
                    break;
                }
            }
            System.out.print(binarioDeciaml);
        }
    }
}
