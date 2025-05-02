public class eliminandoCaracters {
    public static void main(String[] args) {
        /*
        "\\s+", ""
         * Crea una función que reciba dos cadenas como parámetro (str1, str2)
         * e imprima otras dos cadenas como salida (out1, out2).
         * - out1 contendrá todos los caracteres presentes en la str1 pero NO
         *   estén presentes en str2.
         * - out2 contendrá todos los caracteres presentes en la str2 pero NO
         *   estén presentes en str1.
         */
        System.out.println(eliminarCaracter("Me gusta Java","Me gusta Kotlin"));
    }
    public  static  String eliminarCaracter(String str1, String str2){
        StringBuilder out1 = new StringBuilder();
        StringBuilder out2 = new StringBuilder();
        for(char c : str1.toLowerCase().replaceAll("\\s+", "")){
            if(!str2.toLowerCase().contains(c)){
                out1.append(c);
            }
        }
        return  "zapallo";
    }
}
