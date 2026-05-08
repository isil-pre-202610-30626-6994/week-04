public class Calculator {
    
    public static void getMax(int a, int b){

        if (a > b) {
            System.out.println("The number a is greater.");
            return;
        }

        if (b > a) {
            System.out.println("The number b is greater.");
            return;
        }

        System.err.println("The numbers are equal.");
    }

    public static double executeOperation(int a, int b, char operator){
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
