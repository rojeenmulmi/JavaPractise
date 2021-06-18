import java.util.Scanner;

public class SubtractionLoopTest {
    public static void main(String[] args) {
        final int TotalQuestions=5;
long StartTime=System.currentTimeMillis();
        int Count=0;
        int CorrectCount=0;
        Scanner input=new Scanner(System.in);
        while (Count<TotalQuestions)
        {


        int Number1=(int)(Math.random()*10);
        int Number2=(int)(Math.random()*10);

        if (Number1<Number2) {
            int temp = Number1;
            Number1 = Number2;
            Number2 = temp;
        }
            System.out.println("What is "+Number1+"-"+Number2+"? ");

            int Result= input.nextInt();

            if (Number1-Number2==Result){
                System.out.println("Your are correct");
                CorrectCount++;
            }
            else
                System.out.println("You got it wrong");

            Count++;
        }
        long EndTime=System.currentTimeMillis();
        long TestTime=EndTime-StartTime;
            System.out.println("Total Correct is: "+CorrectCount +"\n Test time"+TestTime);
    }


}
