
public class Main {
    public static void main(String[] args) {

        CPU c1 = new CPU(40,"Ahmed");

        CPU.Processor p1 = c1.new Processor();
        CPU.RAM r1 = c1.new RAM();
       // System.out.println(p1.getCache());
        System.out.println(r1.getClockSpeed());

        CPU.Processor p2 = c1.new Processor();
       p2.getCache();

       CPU.USB u1 = new CPU.USB();
        System.out.println(u1.getPortsNumber());

    }
}