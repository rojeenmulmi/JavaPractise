import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int LotteryNumber = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Two digits number: ");

        int Guess = input.nextInt();

        int LotteryNumberDigit1 = LotteryNumber / 10;
        int LotteryNumberDigit2 = LotteryNumber % 10;

        int GuessNumberDigit1 = Guess / 10;
        int GuessNumberDigit2 = Guess % 10;

        System.out.println("Lottery Number is: " + LotteryNumber);

        if (LotteryNumber == Guess)
            System.out.println("Both number matched, You won $10,000!!!");

        else if ((LotteryNumberDigit1 == GuessNumberDigit2) && (LotteryNumberDigit2 == GuessNumberDigit1))
            System.out.println("You won $5,000!!!");
        else if ((LotteryNumberDigit1 == GuessNumberDigit1) ||
                (LotteryNumberDigit1 == GuessNumberDigit2) ||
                (LotteryNumberDigit2 == GuessNumberDigit1) ||
                (LotteryNumberDigit2 == GuessNumberDigit2))

            System.out.println("You got one digit, You won $1,000!!!");
        else
            System.out.println("You Lose");

    }
}
