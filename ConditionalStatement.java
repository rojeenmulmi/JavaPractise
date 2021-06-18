import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int Number = input.nextInt();

        if (Number % 5 == 0)
            System.out.println("Divisible by five!!!");

        if (Number % 2 == 0)
            System.out.println("Divisible by two!!!");

        if (Number % 2 == 0)
            System.out.println("Even Number");
        if (Number % 2 != 0)
            System.out.println("Odd Number");
    }
}
