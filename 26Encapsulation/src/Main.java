class Car{
   private String name;
    private String color;
    private int speed;
    Car(String name,String color,int speed){
        this.name = name;
        this.color = color;
        this.speed = speed;
    }
    public void showInfo(){
        System.out.println("name: " +name+ " color: " +color+ " speed: "+ speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}




public class Main {
    public static void main(String[] args) {

        Car ca1 = new Car("Taxi","Yellow",4000);
        ca1.showInfo();
       ca1.setName("Taxi2");
       ca1.setSpeed(100);
       System.out.println(ca1.getName());
        System.out.println(ca1.getSpeed());

    }
}