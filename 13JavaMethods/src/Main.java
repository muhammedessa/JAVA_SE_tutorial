
public class Main {

    public int sumNumbers(int num1, int num2)
    {
       int result = num1+num2;
       return result;
    }

    public static int multiNumbers(int num1 )
    {
        int result = num1*num1;
        return result;
    }

    public void showInfo(){
        System.out.println("Muhamed Essa");
    }

    public void showInfo2(String ame){
        System.out.println("Muhamed Essa" +ame );
    }

    public static void main(String[] args) {

        int x = 2;
        int y=3;
      Main m = new Main();
      int sum = m.sumNumbers(x,y);
      int multi = m.multiNumbers(4);
      System.out.println(sum);
        System.out.println(multi);
        m.showInfo();
        m.showInfo2(" Hameed");

        System.out.println("Square root 6: " + Math.sqrt(6));

        for (int i=1;i<=4;i++){
            int result2 = multiNumbers(i);
            System.out.println("Square of " + i +" is: "+ result2);
        }

    }
}