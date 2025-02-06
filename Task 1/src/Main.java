public class Main {
    public static void main(String[] args) {
        Phone imelon = new Phone("87954685254", "Imelon", 160);
        imelon.receiveCallName("Берік");

        Phone nokia = new Phone("87451256487", "Nokia", 150);
        Phone.madeIn = "China";

        System.out.println(imelon.madeIn);
        System.out.println(nokia.madeIn);
    }
}
