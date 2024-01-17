import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to check it is automorphic or not :- ");
        int num = sc.nextInt();
        int n = num;
        int count = 0;
        while (num > 0) {
            count++;
            num/=10;
        }
        num = n;
        System.out.println(count);
        int pow = num*num;
        System.out.println(pow);
        int check =1;
        for(int i=1;i<=count;i++) {
            check*=10;
        }
        System.out.println(pow%check);
        if(num==(pow%check))
        System.out.println("it is an automorphic");
        else
        System.out.println("it is not an automorphic");
    }
}