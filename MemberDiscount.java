import java.util.Scanner;

public class MemberDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter membership level (Silver, Gold, Platinum): ");
        String level = scanner.nextLine();

        System.out.print("Enter total purchase amount: ");
        double total = scanner.nextDouble();

        double discountRate = 0.0;

        if (level.equalsIgnoreCase("Silver")) {
            discountRate = 0.05;
        } else if (level.equalsIgnoreCase("Gold")) {
            discountRate = 0.10;
        } else if (level.equalsIgnoreCase("Platinum")) {
            discountRate = 0.15;
        } else {
            System.out.println("Invalid membership level!");
            return;
        }

        double discount = total * discountRate;
        double finalPrice = total - discount;

        System.out.println("\n--- Receipt ---");
        System.out.println("Member level: " + level);
        System.out.println("Total purchase: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final price: " + finalPrice);
    }
}
