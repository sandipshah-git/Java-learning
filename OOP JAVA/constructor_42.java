public class constructor_42 {
    public static void main(String[] args){
         // constructor = A special method to initialize objects
        //                         You can pass arguments to a constructor
        //                         and set up initial values
        // (use same name of class as a creating method is known constructor)

        // initialize class
        student_42 student1 = new student_42 ("Spongebob", 30, 3.2);
        student_42 student2 = new student_42 ("Patrick", 34, 1.5);
        student_42 student3 = new student_42 ("Sandy", 27, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        
        student1.study();
        student2.study();
        student3.study();
    }

}
