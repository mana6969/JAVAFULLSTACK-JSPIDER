//! Static variables can be reffered with object refference but it's not recomended,
public class StaticNonstatic1 {
    static int a;
    int b;

    public static void main(String[] args) {
        StaticNonstatic1 s = new StaticNonstatic1();
        System.out.println(s.b);
        System.out.println(s.a);    
    }
}