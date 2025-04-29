import java.util.ArrayList;

public class numeroPrimo {
    public static void main(String[] args) {
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         */
        ArrayList<Integer> numeroPrimos = new ArrayList<Integer>();
        ArrayList<Integer> numerosNoPrimos = new ArrayList<Integer>();
        for (int i = 2; i < 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if(i % j == 0){
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo){
                numeroPrimos.add(i);
            }else{
                numerosNoPrimos.add(i);
            }
        }
        System.out.println(numerosNoPrimos);
        System.out.println(numeroPrimos);
    }
}
