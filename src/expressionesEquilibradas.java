import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class expressionesEquilibradas {
    public static void main(String[] args) {
        String expresion = "{ [ a * ( c + d ) ] - 5 }";
        String valoresDeEntrada = expresion.replaceAll("\\s", "");
        char[] caracteres = valoresDeEntrada.toCharArray();
        System.out.println(verificacionEquilibrada(caracteres));
    }
    public static String verificacionEquilibrada(char[] expresion){
        ArrayList<String> stack = new ArrayList<>();
        Map<Character, Character> pares = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        for(char exp : expresion){
            if (exp == '(' || exp == '[' || exp == '{') {
                stack.add(String.valueOf(exp));
            } else if (pares.containsKey(exp)) {
                if (stack.isEmpty() || !stack.get(stack.size() - 1).equals(String.valueOf(pares.get(exp)))) {
                    return "No está balanceado";
                }
                stack.remove(stack.size() - 1);
            }
        }
        return stack.isEmpty() ? "Está balanceado" : "No está balanceado";
    }
}
