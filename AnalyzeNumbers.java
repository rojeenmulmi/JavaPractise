import java.util.Scanner;

public class AnalyzeNumbers
    {
    public static void main(String[] args)
        {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items:  ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++)
            {
            numbers[i] = input.nextDouble();
            sum = sum + numbers[i];


            }
        double average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++)
            if (numbers[i] > average)
                count++;
        System.out.println("Average is " + average);
        System.out.println("number of elements above average is " + count);
        }
    }
