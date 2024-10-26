import java.security.PublicKey;

public class Main {

    public static  void showInfo(String name){
        System.out.println(name);
    }

    public static  void showInfo(int age){
        System.out.println(age);
    }
    public static  void showInfo(float age1){
        System.out.println(age1);
    }
    public static  void showInfo(String name,String lname){
        System.out.println(name + lname);
    }
    public static  void showInfo(String name,String mname,String lname){
        System.out.println(name+mname+lname);
    }
    
    public static void main(String[] args) {

        showInfo("Muhammed");
        showInfo(40);
        showInfo(3000);
        showInfo("Muhammed"," Essa");
        showInfo("Muhammed"," Essa"," Hameed");
    }
}