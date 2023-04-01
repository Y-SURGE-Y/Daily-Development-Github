import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
