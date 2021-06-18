import java.util.Scanner;

public class ReadingChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a Character: ");
        String s = input.nextLine();
        char ch=s.charAt(0);
        System.out.println("The character is: "+ch);
    }
}
