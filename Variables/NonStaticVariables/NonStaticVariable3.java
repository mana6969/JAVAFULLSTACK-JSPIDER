class Test {
    int a;
    int b;
}

public class NonStaticVariable3 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.a);
        System.out.println(t.b);
    }
}
