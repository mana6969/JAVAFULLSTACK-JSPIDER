import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digit count = " + count(sc.nextInt()));        
    }
    public static int count(int n)
    {
        if(n==0) return 0;
        return 1+count(n/10);
    }
}
