import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check strong :- ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            System.out.println(digit + "-" + fact);
            sum += fact;
            num/=10;
        }
        System.out.println(sum);
        if (n == sum)
            System.out.println("it is a strong number");
        else
            System.out.println("it is not strong number");
    }
}
