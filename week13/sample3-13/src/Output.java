public class Output {

    public static void display(String message, int value) {
        System.out.printf("%s = %,d Cm\n", message, value);
    }

    public static void display(String message, double value) {
        System.out.printf("%s = %,.2f \u33A0\n", message, value);
    }
}