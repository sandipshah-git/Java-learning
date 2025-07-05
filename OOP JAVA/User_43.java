public class User_43 {

    String username;
    String email;
    int age;

    User_43(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }
    User_43(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    User_43(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User_43(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
