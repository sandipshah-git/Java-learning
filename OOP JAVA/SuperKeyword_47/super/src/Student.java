public class Student extends Person {

    double gpa;

    Student(String first, String last, double gpa){
        super(first,last);
        this.gpa = gpa;
    }
    void showCase(){
        System.out.println(first + " " + last + " has " + this.gpa + " gpa.");
    }

}
