import java.util.Scanner;

public class NoteChange_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = scanner.nextInt();

        int totalAmount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of product " + i + ": ");
            int price = scanner.nextInt();
            System.out.print("Enter quantity of product " + i + ": ");
            int quantity = scanner.nextInt();

            totalAmount += price * quantity; 
        }

        System.out.println("Total amount to pay: " + totalAmount + " baht");

        int amountPaid = 1000; 
        System.out.println("Amount paid: " + amountPaid + " baht");

        if (amountPaid < totalAmount) {
            System.out.println("Not enough money!!");
        } else {
            int change = amountPaid - totalAmount;
            System.out.println("Change is: " + change + " baht");

            int fiveHundred = change / 500;
            change %= 500;

            int hundred = change / 100;
            change %= 100;

            int fifty = change / 50;
            change %= 50;

            int twenty = change / 20;
            change %= 20;

            int ten = change / 10;
            change %= 10;

            int five = change / 5;
            change %= 5;

            int two = change / 2;
            change %= 2;

            int one = change;

            System.out.println("Five-hundred note: " + fiveHundred + " note(s)");
            System.out.println("Hundred note: " + hundred + " note(s)");
            System.out.println("Fifty note: " + fifty + " note(s)");
            System.out.println("Twenty note: " + twenty + " note(s)");
            System.out.println("Ten coin: " + ten + " coin(s)");
            System.out.println("Five coin: " + five + " coin(s)");
            System.out.println("Two coin: " + two + " coin(s)");
            System.out.println("One coin: " + one + " coin(s)");
        }

        scanner.close();
    }
}
