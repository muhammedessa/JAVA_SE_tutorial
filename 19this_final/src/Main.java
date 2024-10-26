final class Person{
    int age = 40;
   private String name;
   final float salary = 3000.0f;

//    Person(int age){
//        this.age = age;
//
//        System.out.println("age: "+ age);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public final void showInfo(){
        System.out.println("Muhammed Essa");
    }
}


public class Main{
    public static void main(String[] args) {

//        Person p1 = new Person(39);
//        p1.setName("Ali");
//        System.out.println( p1.getName());
    }


}