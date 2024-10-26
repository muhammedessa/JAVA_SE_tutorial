import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age = 40;
        String name = "Ali Essa";
      //  System.out.println("Muhammed Essa");
      //  System.out.print("Muhammed Essa");
      //  System.out.print("Muhammed Essa");
//        System.out.println(name + age);
//        System.out.printf("Muhammed Essa and age %s", age);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int result = input.nextInt();
//        System.out.println("you entered: " + result);
//        input.close();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a float  number : ");
        float result = input.nextFloat();
        System.out.println("you entered: " + result);

        System.out.println("Enter a double  number : ");
        double result1 = input.nextDouble();
        System.out.println("you entered: " + result1);

        System.out.println("Enter a text  number : ");
        String result2 = input.next();
        System.out.println("you entered: " + result2);

    }
}