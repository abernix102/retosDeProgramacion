public class fizzBuzz {
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void refactorFizzBuzz(){
        for(int i=1; i <=100; i++){
            String output = "";
            if (i % 3 == 0) output += "fizz";
            if (i % 5 == 0) output += "buzz";
            System.out.println(output.isEmpty() ? i : output );
        }
    }
    public static void main(String[] args) {
        refactorFizzBuzz();
    }
}
