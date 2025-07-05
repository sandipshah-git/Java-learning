public class overloadedConstructor_43 {
    public static void main(String[] args) {

        // overloaded constructors = Allow a class to have multiple constructors
        //                                                 with different parameter lists.
        //                                                 Enable objects to be initialized in various ways.

        User_43 user1 = new User_43 ("Spongebob");
        User_43 user2 = new User_43 ("Patrick", "PStar@aol.com");
        User_43 user3 = new User_43 ("Sandy", "SCheeks@gmail.com", 27);
        User_43 user4 = new User_43 ();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
