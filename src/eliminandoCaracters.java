public class eliminandoCaracters {
    public static void main(String[] args) {
        System.out.println(eliminarCaracter("Me gQQQQQQusta Java","Me gusta Kotlin"));
    }
    public  static  String eliminarCaracter(String str1, String str2){
        str1 = str1.toLowerCase().replaceAll("\\s+", "");
        str2= str2.toLowerCase().replaceAll("\\s+", "");
        StringBuilder out1 = new StringBuilder();
        StringBuilder out2 = new StringBuilder();
        for(char c : str1.toCharArray()){
            if(!str2.contains(String.valueOf(c)) && out1.indexOf(String.valueOf(c)) == -1){
                out1.append(c);
            }
        }
        for(char c : str2.toCharArray()){
            if(!str1.contains(String.valueOf(c))&& out2.indexOf(String.valueOf(c)) == -1){
                out2.append(c);
            }
        }
        return "caracteres presentes en la str1 pero NO estén presentes en str2. son :" + out1  + "\n" + "caracteres presentes en la str2 pero NO estén presentes en str1 son : " + out2;
    }
}

   /*
        "\\s+", ""
         * Crea una función que reciba dos cadenas como parámetro (str1, str2)
         * e imprima otras dos cadenas como salida (out1, out2).
         * - out1 contendrá todos los caracteres presentes en la str1 pero NO
         *   estén presentes en str2.
         * - out2 contendrá todos los caracteres presentes en la str2 pero NO
         *   estén presentes en str1.
         */