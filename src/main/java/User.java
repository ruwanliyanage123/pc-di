public class User {
    public static void main(String[] args) {
        //with Intel processor and DDR3 ram
        Processor intelProcessor = new IntelProcessor();
        Ram ddr3Ram = new DDR3Ram();
        Laptop laptop = new Laptop(intelProcessor, ddr3Ram);
        laptop.start();


        //upgrade with Intel processor and DDR4 ram
        Processor amdProcessor = new AMDProcessor();
        Ram ddr4Ram = new DDR4Ram();
        laptop = new Laptop(amdProcessor, ddr4Ram);
        laptop.start();
    }
}
