class Person{
    Names myNames;
    Person(Names myNames){
        this.myNames = myNames;
    }
    void orderNames(){
        switch (myNames){
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