class Polygon{
    public  void calculate(){
        System.out.println("class Polygon");
    }
    public  void calculate(int a, int b){
        System.out.println("class Polygon");
    }
}

class Square extends  Polygon{
    public  void calculate(){
        System.out.println("class Square");
    }
    public  void calculate(int a, int b){
        System.out.println("class Square");
    }
}

class Circle extends  Polygon{
    public  void calculate(){
        System.out.println("class Circle");
    }
    public  void calculate(int a, int b){
        System.out.println("class Square");
    }
}

public class Main {
    public static void main(String[] args) {

        Square s1 = new Square();
        s1.calculate();
        s1.calculate(1,2);
        Circle c1 = new Circle();
        c1.calculate();
        c1.calculate(1,2);
    }
}