public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    private static void print(int i) {
        if (i == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(i);
        print(i + 1);
    }

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 1);
    }
}