public class factorialRecursivo {
    public static void main(String[] args) {
        System.out.println(factorialR(5));
    }
    public  static int factorialR(int n ){
        if(n == 0) return 1;
        return n * factorialR(n  -1 );
    }
}
/*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 * Pila de java
 * un seguimiento de pila, tambien llamado seguimiento de pila o simplemente
 * seguimiento de pila, es una lista de marcos de pila. Estos marcos representan un momento durante la ejecucion
 * de un aplicacion. un marco de pila contiene informacion sobre un metodo o funcion que el codigo llamo. por lo tanto
 * el seguimiento de pila de java es una lista de marcos que comienza en el metodo actual  y se extiende hasta el
 * momento en que se inicio e promgrama.
 * Una pila es una estructura de datos que actúa como una pila de papeles en tu escritorio: el orden de entrada es el primero en entrar, el último en salir.
 * Se añaden documentos a la pila y se retiran en orden inverso al de su colocación.
 * La pila, más precisamente llamada pila de tiempo de ejecución o pila de llamadas, es un conjunto de marcos de pila que un programa crea al ejecutarse,
 * organizados en una estructura de datos de pila.
 */