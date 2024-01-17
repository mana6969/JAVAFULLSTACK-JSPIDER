import java.util.Scanner;

public class StrongNumList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter range:- ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        for (int i = a; i <= b; i++) {
            if (isStrongNum(i))
                System.out.println(i);
        }
    }

    static boolean isStrongNum(int n) {
        int sum = 0;
        int num = n;
        while (n > 0) {
            sum += fact(n % 10);
            n /= 10;
        }
        return sum == num;
    }

    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
