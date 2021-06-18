import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pound: ");
        int Weight = input.nextInt();

        System.out.println("Enter Height in Inch: ");
        int Height = input.nextInt();

        double WeightInKilo = Weight * 0.4535927;
        double HeightInMeters = Height * 0.0254;

        double BMI = (WeightInKilo) / (Math.pow(HeightInMeters, 2));

        System.out.println("Your BMI is :" + BMI);

        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal");
        else if (BMI < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}
