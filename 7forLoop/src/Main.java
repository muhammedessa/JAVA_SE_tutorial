
public class Main {
    public static void main(String[] args) {

//        int num = 6;
//        for(int i=1 ; i <= num;++i){
//            System.out.printf(" %s Muhammed",i);
//        }

//        int num = 6;
//        int result = 0;
//        for(int i=1 ; i <= num;++i){
//            result +=i;
//        }
//        System.out.printf("sum:  "+result);

//        int num = 6;
//        int result = 0;
//        for(int i=1 ; i <= num;--i){
//            result +=i;
//        }
//        System.out.printf("sum:  "+result);

        int[] nums ={1,2,3,4,5};
        int total =0;
        for(int n: nums){
            total+=n;
            System.out.println("number:  "+n);
        }
        System.out.println("Total:  "+total);
    }
}