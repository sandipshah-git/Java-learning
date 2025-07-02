public class student_42 {
    
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    student_42 (String name, int Age, double gpa){
        this.name = name;  // ✅ You need (this.) when variable names are the same.
        age = Age;  //  ✅ This works without (this.) because the names are different (age vs Age).
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
