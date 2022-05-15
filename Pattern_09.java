import java.util.*;

public class Pattern_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Row(m) ::");
        int m = sc.nextInt();
        int num = 1;
        // int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

}
