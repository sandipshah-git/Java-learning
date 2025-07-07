public class staticKeyword_45 {
    public static void main(String[] args) {

        // static = Modifies a variable or method belong to the class,
        //               rather than to any specific object.
        //               Commonly used for utility methods or shared resources.

        friend_45 friend1 = new friend_45("Spongebob");
        friend_45 friend2 = new friend_45("Patrick");
        friend_45 friend3 = new friend_45("Squidward");
        friend_45 friend4 = new friend_45("Sandy");


        System.out.println(friend1.numOfFriends); // first make its all  comment and u will understand
        System.out.println(friend2.numOfFriends); // first make its all  comment and u will understand
        System.out.println(friend3.numOfFriends); // first make its all  comment and u will understand
        System.out.println(friend4.numOfFriends); // first make its all  comment and u will understand

        System.out.println(friend_45.numOfFriends);

        friend_45.showFriends();  // usign direct class name rather than object like friend1 for access, is helped by static keyword


        friend_45.sayHello(); // No need to create an object (directly can use class due to there uses static key word in sayHello method)

        //  But if it's not static, you must do:
        friend_45 say = new friend_45(null);
        say.sayHello();
    }
}
