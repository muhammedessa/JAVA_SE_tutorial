public class CPU {
    int price ;
    String name;

    public CPU() {
    }

    static  class USB{
        int usb1 =2;
        int usb2 = 3;
        int getPortsNumber(){
            return usb1+usb2;
        }
    }

    public CPU(int price, String name) {
        this.price = price;
        this.name = name;
    }
    String getCPUName(){
        return  this.name;
    }

    class Processor{
        int cores;
        String manufacturer;
        void getCache(){
            if (CPU.this.name == "Muhammed"){
                System.out.println("Muhammed");
            }else {
                System.out.println("Ahmed");
            }
           // return 4;
        }
    }
   protected class RAM{
        int memory;
        String manufacturer;
        int getClockSpeed(){
            return 6;
        }
    }



}
