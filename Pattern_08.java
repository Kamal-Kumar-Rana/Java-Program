import java.util.*;

public class Pattern_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Row(m) ::");
        int m = sc.nextInt();
        // int n = sc.nextInt();
        /*
         * for (int i = m; i >= 1; i--) {
         * for (int j = 1; j <= i; j++) {
         * 
         * System.out.print(j + " ");
         * }
         * System.out.println();
         * }
         */

        // Different code for same output
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= (m - i + 1); j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
