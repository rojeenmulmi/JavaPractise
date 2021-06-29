public class MultiDimensionalArray
    {
    public static void main(String[] args)
        {
        int[][] a = {{10, 20, 30, 40}, {555, 666, 999}, {1000, 3000}};

        for (int i = 0; i < a.length; i++)//a.length Number of rows
            {
            for (int j = 0; j < a[i].length; j++)// a[i].length Number of columns in each rows
                {
                System.out.println(a[i][j]);
                }
            System.out.println(" ");
            }
        }
    }
