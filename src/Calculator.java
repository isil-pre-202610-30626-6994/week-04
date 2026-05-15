
public class Calculator {

    public static void getMax(int a, int b) {

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

    public static double executeOperation(int a, int b, char operator) {
        return switch (operator) {
            case '+' ->
                a + b;
            case '-' ->
                a - b;
            case '*' ->
                a * b;
            case '/' ->
                a / b;
            case '%' ->
                a % b;
            default ->
                throw new IllegalArgumentException("Invalid operator");
        };
    }

    public static void displayEvenNumbers(int min, int max) {

        while (min <= max) {
            if (min % 2 == 0) {
                System.out.println(min + " is an even number.");
            }
            min++;
        }

    }

    public static void calculateMultiplesOfSix(int min, int max) {

        int count = 0;
        int sum = 0;

        for (int i = min; i <= max; i++) {
            if (i % 6 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("There a " + count + " multiple numbers of six.");
        System.out.println("The total is: " + sum);
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
