public class Main {
    public static void main(String[] args) {
        
    }
    private static int gCD(int a, int b){
        int c = 0;
        if (a > b){
            c = b;
        }else {
            c = a;
        }
        for (int i = c / 2; i > 0; i --) {
            if (a % i == 0 && b % i == 0){
                return i;
            }
        }
    }

}