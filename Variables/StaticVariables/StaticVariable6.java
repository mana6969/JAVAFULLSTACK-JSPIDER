public class StaticVariable6 {
    static int i=14;
    public static void m1() {
        m2();
        i=9;
        System.out.println(i);
    }
    public static void m2() {
        System.out.println(i);
    }
    public static void main(String[] args) {
        m1();
        System.out.println(i);
    }
}
