import java.util.Scanner;

class MultiplicationTable {


    public static void MultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++)
            System.out.println(number +
                    " * " + i + " = " + number * i);
    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer number::");
        int number = input.nextInt();

        MultiplicationTable(number);

    }
}