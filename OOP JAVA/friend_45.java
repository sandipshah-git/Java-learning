public class friend_45 {

    static int numOfFriends;
    String name;

    friend_45(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }

    static void sayHello() {
        System.out.println("Hello!");
    }
}