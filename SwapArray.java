public class SwapArray
    {
    public static void main(String[] args)
        {
        int[] a = {5, 10};

        swapFirstTwoArray(a);
        System.out.println(a[0] +
                "," + a[1]);
        }

    public static void swapFirstTwoArray(int[] array)
        {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        }
    }
