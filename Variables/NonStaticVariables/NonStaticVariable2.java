//! For Non-static variables memory will be created/allocated at the time of each and every object creation
public class NonStaticVariable2 {
    int a;
    int b;
    public static void main(String[] args) {
        NonStaticVariable2 n1 = new NonStaticVariable2();
        System.out.println(n1.a);
        System.out.println(n1.b);
        NonStaticVariable2 n2 = new NonStaticVariable2();
        System.out.println(n2.a);
        System.out.println(n2.b);
        n1.a=1;
        n2.b=2;
        System.out.println(n1.a);
        System.out.println(n1.b);
        System.out.println(n2.a);
        System.out.println(n2.b);
    }
}