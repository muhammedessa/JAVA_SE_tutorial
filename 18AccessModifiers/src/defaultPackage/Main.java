package defaultPackage;

class Data{
   private String name;
   public String getName(){
       return  this.name;
   }
   public void  setName(String name){
       this.name= name;
   }
}



public class Main extends Animal{
    public static void main(String[] args) {
//    defaultPackage.Data d1 = new defaultPackage.Data();
//    d1.setName("Muhammed");
//    System.out.println(d1.getName());
        Animal ca1 = new Animal();
        ca1.showInfo();
    }
}

