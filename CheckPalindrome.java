import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter three digits number: ");

        int Number=input.nextInt();

        int Number1=Number/100;
        int Number2=(Number%100)/10;
        int Number3=Number%10;

       if (Number1==Number3)
           System.out.println("The number is palindrome");

           else
           System.out.println("It is not palindrome");
    }
}
