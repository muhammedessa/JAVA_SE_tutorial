
public class Main {
    public static void main(String[] args) {

        String name1 = "Muhammed";
        String name2 = "Muhammed";
        String name3 = "Hameed";
        System.out.println(name1+name2);
        System.out.println(name2+name3);
        System.out.println(name3+name1+" This is");
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.length());
        System.out.println(name1.concat(name2));
        System.out.println(name1.concat(" Essa"));
        System.out.println(name1.equals(name2));
        System.out.println(name1.concat("Muhammed \"Name\" Essa"));

        String myName ="Muhammed";
        System.out.println(myName);
        myName = myName.concat(" Essa");
        System.out.println(myName);
        String myName2 = new String("Hameed");
        System.out.println(myName2);
    }
}