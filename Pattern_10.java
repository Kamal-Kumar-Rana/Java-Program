import java.util.*;

public class Pattern_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Row(m) ::");
        // int m = sc.nextInt();
        int num = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 "); // even
                } else {

                    System.out.print("0 "); // Odd
                }
            }
            System.out.println();
        }
    }

}