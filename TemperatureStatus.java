import java.util.Scanner;

public class TemperatureStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperature = scanner.nextDouble();

        System.out.println("Temperature: " + temperature + "°C");

        String status;

        if (temperature >= 35) {
            status = "Hot";
        } else if (temperature >= 25) {
            status = "Warm";
        } else if (temperature >= 15) {
            status = "Cool";
        } else {
            status = "Cold";
        }

        System.out.println("Status: " + status);
    }
}
