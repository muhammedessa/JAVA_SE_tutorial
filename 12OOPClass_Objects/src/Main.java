
public class Main {
    public static void main(String[] args) {

        Person muhammed = new Person();
        Person ali = new Person();
        Person osama = new Person();
        Person ahmed = new Person();

//        muhammed.age = 30;
//        muhammed.name="hassan";
        muhammed.printinfo();
        ali.name ="Ali";
        ali.age = 20;
        ali.printinfo();
        osama.name="osama";
        osama.age = 50;
        osama.printinfo();
        ahmed.name ="Ahmed";
        ahmed.age = 60;
        ahmed.printinfo();
    }
}

class Person{
    String name="Muhammed";
    int age = 40;

    public void printinfo(){
        System.out.println(name +age );
    }
}
