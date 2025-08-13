import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\nChoose option: ");
        int choice = scan.nextInt();

        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            float celsius = scan.nextFloat();
            System.out.println("Celcius to Fahrenheit: " + ((celsius * 9 / 5) + 32) + "°F");
        } else if (choice == 2) {
            System.out.print("Enter Fahrenheit: ");
            float fahrenheit = scan.nextFloat();
            System.out.println("Fahrenheit to Celsius: " + ((fahrenheit - 32) * 5 / 9) + "°C");
        } else {
            System.out.println("Invalid Choice");
        }
    }
}