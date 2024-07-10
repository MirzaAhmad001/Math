public class Main {
    public static void main(String[] args) {
        System.out.println("Enter ");
    }

    int EKUK(int a, int b) {
        int x = 0;
        while (true) {
            x ++;
            if (x % a == 0 && x % b == 0) {
                return x;
            }
        }
    }
}