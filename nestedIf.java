public class nestedIf {
    public static void main(String[] args){
        //declaration

        boolean isStudent = false;
        boolean isSeniorStudent = true;
        double price = 100;

        if(isStudent){
            if(isSeniorStudent){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You also get a student discount of 10%");
                price -= price*30/100;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price -= price*10/100;
            }
        }
        else{
            if(isSeniorStudent){
                System.out.println("You get a senior discount of 20%");
                price -= price*20/100;
            }
            else{
                price = price*1;
            }
        }

        System.out.printf("The discounted price is Rs.%.2f ",price);


    }
}