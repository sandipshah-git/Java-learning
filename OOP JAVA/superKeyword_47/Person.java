public class Person {

    String first;
    String last;

    Person(String first, String second){
        this.first = first;
        this.last = second;
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}
