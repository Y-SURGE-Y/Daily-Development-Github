import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= (2 * n - 1); i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            } else {
                for (int j = n - 1; j > 0; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
