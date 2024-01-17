import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int n = sc.nextInt();
        if(isPrime(n)) System.out.println("prime");
        else System.out.println("not prime");
    }
    static boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
}