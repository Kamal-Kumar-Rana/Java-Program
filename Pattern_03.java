
import java.util.*;

public class Pattern_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Row(n) and Collumn(m)::");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                // cell->(i,j)
                if (i == 1 || i == n || j == 1 || j == m) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
