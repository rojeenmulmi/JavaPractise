import java.util.Scanner;

public class SentinelAdd {
    public static void main(String[] args) {
        int Sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number(Enter 0 to end): ");
        int Num = input.nextInt();
        while (Num != 0) {

            Sum = Sum + Num;
            System.out.print("Enter a number(Enter 0 to end): ");
            Num = input.nextInt();


        }
        System.out.println("Sum of the above numbers is " +Sum);
    }
}
