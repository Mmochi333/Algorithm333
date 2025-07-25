import java.util.Scanner;
public class mm {
    public static void main (String args[]) {
        // int num1 = 4;
        // int num2 = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1 ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2 ");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println("Sum is="+sum);
    }
}