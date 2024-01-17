import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(isPalindrome(sc.nextInt()))
        System.out.println("Palindrome");
    }
    public static boolean isPalindrome(int n)
    {
        return n==rev(n,0);
    }
    public static int rev(int n,int rev)
    {
        if(n==0) return rev;
        rev=(rev*10)+n%10;
        return rev(n/10,rev);
    }
}
