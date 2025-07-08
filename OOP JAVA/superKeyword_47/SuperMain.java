public class SuperMain {
    public static void main(String[] args){

        // super = Refers to the parent class
        //               Used in constructors and method overriding
        //               Calls the parent constructor to initialize attributes

        Person person = new Person("sandip", "Shah");
        Student student = new Student("janna", "mahara", 3.2);
        Employee employee = new Employee("Ram" , "shah", 450000);

        person.showName();
        student.showCase();
        student.showName();
        employee.showSalary();
    }
}
