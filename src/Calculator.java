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
}
