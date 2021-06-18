import java.util.Scanner;

public class ConvertStringNum {
    public static void main(String[] args) {

        System.out.println("Enter String Number:" );
        Scanner input=new Scanner(System.in);

        String Num=input.nextLine();

        int NewNum=Integer.parseInt(Num);

        double Add= (double) (10.67894+NewNum);
        System.out.printf("Total is %.2f",Add);
    }
}
