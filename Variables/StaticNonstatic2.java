//! For static variables only one copy of memory is created.
public class StaticNonstatic2 {
    static int a;
    int b;

    public static void main(String[] args) {
        StaticNonstatic2 s1 = new StaticNonstatic2();
        s1.a=1;
        s1.b=2;
        System.out.println(s1.a);
        System.out.println(s1.b);
        StaticNonstatic2 s2 = new StaticNonstatic2();
        System.out.println(s2.a);
        System.out.println(s2.b);
    }
}
