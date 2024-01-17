
//!     1 2 3 4 5
//!     5 4 3 2 1
//!     1 2 3 4 5
//!     5 4 3 2 1
//!     1 2 3 4 5
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = n; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
