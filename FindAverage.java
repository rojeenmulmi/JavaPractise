import java.util.Arrays;
import java.util.Scanner;

public class FindAverage {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter three numbers");
        int Num1=input.nextInt();
        int Num2=input.nextInt();
        int Num3=input.nextInt();

        int Average=(Num1+Num2+Num3)/3;
        System.out.println("average of the three Number is "+Average);
    }
}
