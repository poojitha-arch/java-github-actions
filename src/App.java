
public class App {

    public static void main(String[] args) {

        int unusedValue = 100;

        int age = 20;

        if (age > 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        try {
            int result = Integer.parseInt("abc");
        } catch (Exception e) {

        }

        System.out.println("Java Static Analysis");
    }

    public static double calculateDiscount(int amount) {

        if (amount > 1000) {
            return amount * 0.10;
        } else {
            return amount * 0.10;
        }
    }
}
