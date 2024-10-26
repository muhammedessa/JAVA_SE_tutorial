
public class Main {
    public static void main(String[] args) {

        int num = 20;
        String name;
        switch (num){
            case 1:
                name = "Muhammed";
                break;
            case 2:
                name = "Essa";
                break;
            case 3:
                name = "Hameed";
                break;
            case 4:
                name = "Ali";
                break;
            default:
                name = "default";
                break;
        }
        System.out.println("name: " + name);
    }
}