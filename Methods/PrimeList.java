import java.util.Scanner;
public class PrimeList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter range:- ");        
        int a = scn.nextInt();
        int b = scn.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(Prime.isPrime(i)) System.out.println(i);
        }
    }
}
