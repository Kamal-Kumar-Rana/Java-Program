
import java.util.*;

public class If_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        /*
         * if (age > 18) {
         * System.out.println("Adult");
         * 
         * } else {
         * System.out.println("Not Adult");
         * }
         */
        /*
         * System.out.println("Enter a number ");
         * int num = sc.nextInt();
         * if (num % 2 == 0) {
         * 
         * System.out.println(num + " is Even Number");
         * 
         * } else {
         * System.out.println(num + " is Odd Number");
         * }
         */

        int a = sc.nextInt();
        int b = sc.nextInt();
        /*
         * if (a == b) {
         * System.out.println("Equal!");
         * } else { q // Nested if_else
         * if (a > b) {
         * System.out.println("a is greater!");
         * 
         * } else {
         * System.out.println("b is greater!");
         * }
         */
        if (a == b)

        {

            System.out.println("Equal!");
        }

        else if (a > b) {
            System.out.println("a is greater!");

        }

        else
            System.out.println("b is greater!");

    }

}
