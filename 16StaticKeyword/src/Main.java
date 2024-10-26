class Employee{
   static int age;
   static double salary;
    public static void showInfo(){
        salary = 2.2;
        System.out.println("Ahmed Essa");
    }

    int multiply(int a, int b){
        return a * b;
    }

    static int add(int a, int b){
        return a + b;
    }
}



public class Main {

    public static void showInfo(){
        System.out.println("Muhammed Essa");

    }

    public static void main(String[] args) {

//        System.out.println(Math.abs(-22));
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//        System.out.println(Math.pow(2,2));
        Main.showInfo();
        Employee.showInfo();
        System.out.println(Employee.add(1,2));
        Employee emp1 = new Employee();
        System.out.println( emp1.multiply(2,3));
        Employee.age = 40;
        System.out.println(Employee.age);

    }
}