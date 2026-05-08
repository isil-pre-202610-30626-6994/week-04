public class App {
    public static void main(String[] args) throws Exception {
       
        Student student = new Student("Carlos Paredes", 12);
        
        if (student.isPassed()){
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has not passed.");
        }
    }
}
