
//!              *
//!            * * * 
//!          * * * * * 
//!        * * * * * * *
//!      * * * * * * * * *
import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = (2 * i) - 1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
