import java.util.Scanner;

public class mm {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 

        double sum = 0; 
        int numberOfInputs = 5; 
        System.out.println("Please enter 5 numbers:"); 

        for (int i = 1; i <= numberOfInputs; i++) {
            System.out.print("Enter number " + i + ": "); 
            int num = scanner.nextInt();
            sum = sum + num; 
        }

        double average = sum / numberOfInputs; 
        System.out.println("The sum of the 5 numbers is: " + sum);
        System.out.println("The average of the 5 numbers is: " + average);

        scanner.close(); 
    }
}