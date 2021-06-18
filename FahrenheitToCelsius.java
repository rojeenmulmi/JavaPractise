import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit : ");
        double Fahrenheit = input.nextDouble();

        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.println(+Fahrenheit + " is " + Celsius + "Celsius");

    }
}
