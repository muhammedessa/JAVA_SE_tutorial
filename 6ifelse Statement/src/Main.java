
public class Main {
    public static void main(String[] args) {

        int age = 18;
        String name="Essa";

//        if(age >= 18){
//            System.out.println("Welcome");
//        }
//        if(name == "Essa"){
//            System.out.println("Welcome Essa");
//        }else {
//            System.out.println("You are not Essa");
//        }

   if(age > 18){
            System.out.println("Greater than 18");
        }
   else if (age == 18) {
       System.out.println("you are 18");
       if(age > 18){
           System.out.println("inner if");
       }else {
           System.out.println("inner else");
       }
   } else {
       System.out.println("Less than 18");
   }
    }
}