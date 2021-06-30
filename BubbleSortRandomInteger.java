import java.util.Random;

public class BubbleSortRandomInteger
    {
    public static void main(String[] args)
        {
        int[] a = new int[50];//Total number to generate
        for (int i = 0; i < a.length; i++)
            {
            a[i] = new Random().nextInt(1000);//Random three digits number
            System.out.print(a[i] + " ");

            }
        

        int temp;
        for (int i = 0; i < a.length; i++)
            {

            for (int j = 0; j < a.length - 1; j++)
                {
                if (a[j] > a[j + 1])
                    {
                    temp = a[j];//swap number if greater
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    }

                }


            }
        System.out.println("After Sorting: ");
        for (int i = 0; i < a.length; i++)
            {
            System.out.print(a[i] + " ");

            }

        }
    }

