import java.util.*;

public class Pattern_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Row(m) ::");
        int m = sc.nextInt();
        // int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            // inner loop-> Space
            for (int j = 1; j <= (m - i); j++) {

                System.out.print(" ");
            }
            // inner loop -> Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
