class Person{
    Person(){
        System.out.println("constructor Person");
    }
    Person(int age){
        System.out.println("constructor Person: " + age);
    }
   protected String name = "Person";
    public void printData(){
        System.out.println("class Person");
    }
}

class Muhammed extends Person{
    Muhammed(){
        super(40);
    }
    public String name = "Muhammed";
    public void printName(){
        System.out.println("class :" +name);
        System.out.println("class :" +super.name);
    }
    public void printData(){
        System.out.println("class Muhammed");
    }
    public void printInfo(){
        printData();
        super.printData();
    }
}

public class Main {
    public static void main(String[] args) {

        Muhammed m1 = new Muhammed();
        m1.printInfo();
        m1.printName();

    }
}