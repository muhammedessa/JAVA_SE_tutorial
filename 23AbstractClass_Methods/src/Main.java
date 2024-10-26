abstract class Person{
    Person(){

    }
    abstract void openBluetooth();
    void connectBluetooth(){
        System.out.println("abstract class");
    }
}

class Muhammed extends  Person{
Muhammed(){
    super();
}
    @Override
    void openBluetooth() {
        System.out.println("abstract method Muhammed");
    }
}

class Ahmed extends  Person{

    @Override
    void openBluetooth() {
        System.out.println("abstract method Ahmed");
    }
}

public class Main extends Person {
    public static void main(String[] args) {
 Main m1 = new Main();
 m1.connectBluetooth();
       Muhammed mu1 = new Muhammed();
       mu1.openBluetooth();
        Ahmed a1 = new Ahmed();
        a1.openBluetooth();
    }

    @Override
    void openBluetooth() {

    }
}