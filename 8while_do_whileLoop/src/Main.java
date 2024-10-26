import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int num= 1, num2 = 10;
//        while (num <= num2){
//            System.out.println(num);
//            num++;
//        }

//        int sum =0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = input.nextInt();
//        while (number >= 0){
//            sum += number;
//            System.out.println("Enter a number");
//            number = input.nextInt();
//        }
//        System.out.println("Sum = " + sum);
//        input.close();


//        int i = 1, n = 5;
//
//        do{
//            System.out.println(i);
//            i++;
//        }while (i>= n);


        int sum =0;
        Scanner input = new Scanner(System.in);
        int number = 0;
        do{
            sum += number;
            System.out.println("Enter a number");
            number = input.nextInt();
        } while (number >= 0);
        System.out.println("Sum = " + sum);
        input.close();


    }
}