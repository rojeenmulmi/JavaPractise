public class FibonacciMethod {

    public static void main(String[] args) {

        int a = 0;
        fibonacciGenerator(a);

    }

    public static void fibonacciGenerator(int a) {
        int b = 1;

        for (int i = 1; i < 15; i++) {
            System.out.println(a);
            a = a + b;
            b = a - b;
        }
    }
}

