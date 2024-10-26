import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; ++i) {
//
//
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }


//        Double number   ,sum = 0.0;
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter a number: ");
//            number = input.nextDouble();
//
//            if (number < 0.0) {
//                break;
//            }
//            sum += number;
//        }
//        System.out.println("Sum = " + sum);


//        for (int i = 1; i <= 10; ++i) {
//
//            if (i > 4 && i < 9) {
//                continue;
//            }
//            System.out.println(i);
//        }

        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i) {
            System.out.print("Enter number " + i + " : ");
            number = input.nextDouble();
            if (number <= 0.0) {
                continue;
            }
            sum += number;
        }
        System.out.println("Sum = " + sum);
        input.close();


    }
}