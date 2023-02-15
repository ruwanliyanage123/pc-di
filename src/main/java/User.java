public class User {
    public static void main(String[] args) {
        IntelProcessor intelProcessor = new IntelProcessor();
        DDR3Ram ddr3Ram = new DDR3Ram();
        Laptop laptop = new Laptop(intelProcessor, ddr3Ram);
        laptop.start();
    }
}
