public class subString_14 {

    public static void main(String[] args){

        // declaration
        String email = "sandip123456sah@gmail.com";
        String username ,domain;

        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@")); //(0,14); last number is exclussive
            domain = email.substring(email.indexOf("@") + 1); // after comma last index not needed as index
            System.out.println("\nyour username is : " + username);
            System.out.println("your domain is : " + domain);
        }
        else{
            System.out.println("email must contains @");
        }

        
    }
}