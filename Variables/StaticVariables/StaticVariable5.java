public class StaticVariable5 {
    static int a=10;
    public static void main(String[] args) {
        int a=59;
        StaticVariable5.a=22;
        a=33;
        System.out.println(StaticVariable5.a);
        System.out.println(a);
    }
}
