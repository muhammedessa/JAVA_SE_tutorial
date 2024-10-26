
public class Main {
    public static void main(String[] args) {

        int num1 =1;
        int num2 =10;
        int num3 =100;
        int num4 =1000;
        int num5 =10000;
        int num6 =100000;
        int num7 =1000000;
        int num8 =10000000;

      //  int[] nums ;

   //     int[] age = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println("First Element: " + age[0]);
//        System.out.println("Second Element: " + age[1]);
//        System.out.println("Third Element: " + age[2]);
//        System.out.println("Fourth Element: " + age[3]);
//        System.out.println("Fifth Element: " + age[4]);


        int[] nums = new int[10];
        nums[0]=11;
        nums[1]=12;
        nums[2]=13;
        nums[3]=14;
        nums[4]=15;
        nums[5]=16;
        nums[6]=17;
        nums[7]=18;
        nums[8]=19;
        nums[9]=20;

//        System.out.println("First Element: " + nums[0]);
//        System.out.println("Second Element: " + nums[1]);
//        System.out.println("Third Element: " + nums[2]);
//        System.out.println("Fourth Element: " + nums[3]);
//        System.out.println("Fifth Element: " + nums[4]);

        int[] age = {1,2,3,4,5,6,7,8,9,10};
//        for(int i = 0; i < age.length; i++) {
//            System.out.println(age[i]);
//        }

//        int sum=0;
//        for(int a : age) {
////            System.out.println(a);
//            sum +=a;
//        }
//        System.out.println("Sum = " + sum);
//        int ageLength = age.length;
//        double average = ((double) sum/ (double) ageLength);
//        System.out.println("Average = " + average);



//        int[][] num = new int[3][4];
//        String[][][] name = new String[3][4][2];
//        int[][] nums2 ={
//                {1,2,3},{1,2,4,5}
//        };
////        System.out.println("row1 = " + nums2[0].length);
////        System.out.println("row1 = " + nums2[1].length);
//
//        for (int[] d: nums2){
//            for(int r: d){
//                System.out.println(  r);
//            }
//        }


        int[][][] data={
                {
                    {1,2,3},{133,233,433,533}
                },
                {
                {10,20,30},{11,12,14,15},{111,211 }
                }
             };
        for (int[][] d: data){
            for(int[] r: d){
                for(int x:r){
                    System.out.println(  x);
                }

                    }
                }


    }
}