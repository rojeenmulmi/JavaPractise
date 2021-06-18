import java.util.Scanner;

public class EmployeePayCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String Name = input.nextLine();

        System.out.println("Enter Total hours worked: ");
        int Hours = input.nextInt();

        System.out.println("Enter pay rate: ");
        double PayRate = input.nextDouble();

        System.out.println("Enter federal withholding: ");
        double Federal = input.nextDouble();

        System.out.println("Enter state withholding: ");
        double State = input.nextDouble();

        System.out.println("Your pay check");
        System.out.println("Employee Name: " + Name);
        System.out.println("Total Hours: " + Hours);
        System.out.println("Pay Rate: " + PayRate);
        double GrossPay = PayRate * Hours;
        System.out.println("Gross Pay:" + GrossPay);
        System.out.println("Deduction");

        double FedCut = Federal * GrossPay;
        double StateCut = State * GrossPay;
        System.out.printf("     Total Federal withholding is $%.2f", FedCut);
        System.out.println();
        System.out.printf("     Total State withholding is $%.2f", StateCut);

        System.out.println();

        double NetPay = GrossPay - FedCut - StateCut;
        System.out.printf("NetPay is $%.2f", NetPay);


    }
}
