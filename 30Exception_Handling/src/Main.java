import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    static  void divideNum(){
        throw new ArithmeticException("You can not divide by Zero");
    }

    static  void openFile() throws IOException {
        File newFile = new File("text.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {



        try {
            int[] nums = new int[8];
            nums[10] = 10/10;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }



//        try {
//            openFile();
//            System.out.println("Hello am here");
//        }catch (IOException er){
//            System.out.println(er );
//        }
//        catch (IOException e){
//            System.out.println(e );
//        }



       // divideNum();

//        try {
//            int divideNum = 6/1;
//            System.out.println(divideNum);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("finally");
//        }
    }
}