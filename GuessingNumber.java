import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        int Number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number between 1 to 100");

        int Guess =-1;

        while (Guess != Number) {

            System.out.println("Guess the number");
            Guess = input.nextInt();
            if (Guess == Number)
                System.out.println("You got it right");
            else if (Guess < Number)
                System.out.println("The Number you guessed is too low");
            else
                 System.out.println("The Number you guess is too high");
        }
    }
}
