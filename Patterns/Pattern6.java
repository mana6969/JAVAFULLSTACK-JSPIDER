
//!     1   2   3   4   5
//!     10  9   8   7   6 
//!     11  12  13  14  15
//!     20  19  18  17  16
//!     21  22  23  24  25
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                int num = ((i - 1) * n) + 1;
                for (int j = 1; j <= n; j++) {
                    System.out.print(num + "\t");
                    num++;
                }
            } else {
                int num = i * n;
                for (int j = 1; j <= n; j++) {
                    System.out.print(num + " \t");
                    num--;
                }
            }
            System.out.println();
        }
    }
}
