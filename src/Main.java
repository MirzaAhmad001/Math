public class Main {
    public static void main(String[] args) {
        System.out.println("Enter ");
    }

    int EKUK(int a, int b) {
        int x = 0;
        while (true) {
            x++;
            if (x % a == 0 && x % b == 0) {
                return x;
            }
        }
    }

    public static void primeNumbersTillN(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static void fibonacciSeriesTillN(int n) {
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;

        }
    }

    private static int gCD(int a, int b) {
        int c = 0;
        for (int i = c / 2; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                c = i;
            }
        }
        return c;
    }

}