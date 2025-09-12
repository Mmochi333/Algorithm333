import java.util.Scanner;

public class NoteChange_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to pay: ");
        int amountToPay = scanner.nextInt();

        System.out.print("Enter amount paid: ");
        int amountPaid = scanner.nextInt();

        if (amountPaid < amountToPay) {
            System.out.println("Not enough money paid!");
            return; 
        }

        int change = amountPaid - amountToPay;
        System.out.println("Change is : " + change + " baht");

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

        scanner.close();
    }
}
