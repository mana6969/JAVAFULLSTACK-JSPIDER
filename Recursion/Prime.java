import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(isPrime(sc.nextInt(),2))
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
    public static boolean isPrime(int n, int i)
    {
        if(n<=1) return false;
        if(n%i==0) return false;
        if(i>n/2) return true;
        else return isPrime(n,i+1);
    }
}