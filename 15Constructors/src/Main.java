
public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
//        p1.printInfo();
        System.out.println(p1.name);

        Person p2 = new Person("Ahmed");
        Person p3 = new Person("Ahmed","Essa");
        p3.printInfo();

    }
}

class Person{
   public String name;
    public String name4;
    Person(){
        name ="Muhammed";
      System.out.println("Constructor");
    }
    Person(String name2){
        name =name2;
        System.out.println("Constructor: "+ name);
    }
    Person(String name2,String name3){
        name4 =name3;
        name =name2;
    }

    public void printInfo(){
        System.out.println("Method: " +name+" "+name4);
    }
}