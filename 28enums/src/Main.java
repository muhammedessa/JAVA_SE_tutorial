enum Names{
    MUHAMMED,AHMED,ESSA,HAMEED;
    void orderNames(){
        switch (this){
            case MUHAMMED :
                System.out.println("Muhammed");
                break;
            case AHMED :
                System.out.println("AHMED");
                break;
            case ESSA :
                System.out.println("ESSA");
                break;
            case HAMEED :
                System.out.println("HAMEED");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}



public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person(Names.AHMED);
//        p1.orderNames();

        Names.MUHAMMED.orderNames();
    }
}