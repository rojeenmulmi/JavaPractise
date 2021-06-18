public class ListPrimeNumber {
    public static void main(String[] args) {



        for (int i = 1; i < 100; i++) {
            int temp=0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    temp = temp + 1;

                }
            }
            if (temp == 2) {

                System.out.println(i);
            }



        }
    }
}