public class CastingExample {
    public static void main(String[] args) {
        int i = 10;
        m1(i);
        char c = 'a';
        m1(c);
        System.out.println(m2());
    }

    static void m1(double d) {
        System.out.println(d);
    }

    static double m2() {
        int i = 20;
        return i;
    }
}
