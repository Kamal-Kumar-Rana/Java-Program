import java.util.*;

public class Loop {

    public static void main(String[] args) {

        // For Loop
        /*
         * for (int count = 0; count < 11; count++) {
         * // System.out.println("Hello World!");
         * System.out.print(count + " ");
         * }
         */
        // Entry Control Loop
        // while loop
        // int i = 0;
        /*
         * while (i < 11) {
         * 
         * System.out.print(i + " ");
         * i++;
         * 
         * }
         */
        // do_while Loop

        /*
         * do {
         * 
         * // Exit Control Loop
         * System.out.print(i + " ");
         * i++;
         * } while (i < 11);
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum Of Natural Number::::\n Enter Value of n:: ");
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("Table");
        int t = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(t * j);
        }

    }
}
