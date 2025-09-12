import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After swapping:");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
    }
}
