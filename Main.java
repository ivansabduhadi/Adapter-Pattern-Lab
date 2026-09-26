public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger phoneCharger = new SmartphoneCharger();

        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet refOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet phoneOutlet = new SmartphoneAdapter(phoneCharger);

        System.out.println("--- Plugging in devices ---");
        laptopOutlet.plugIn();
        refOutlet.plugIn();
        phoneOutlet.plugIn();
    }
}
