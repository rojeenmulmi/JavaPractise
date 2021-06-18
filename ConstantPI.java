import java.util.Scanner;

public class ConstantPI {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius : ");

        double radius = input.nextDouble();

        double Area = PI * Math.pow(radius, 2);

        System.out.println("Area = " + Area);


    }
}
