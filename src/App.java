public class App {
    public static void main(String[] args) throws Exception {
       
        Student student = new Student("Carlos Paredes", 12);
        
        if (student.isPassed()){
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has not passed.");
        }

        Calculator.getMax(15, 15);

        double result = Calculator.executeOperation(13, 6, '$');
        System.out.println("The result of the operation is: " + result);
    }
}
