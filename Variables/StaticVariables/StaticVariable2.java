//! Static variables are not mandatory to initialize. If we are not initializing then JDK will provide default values for static variables.
public class StaticVariable2 {
    static int i;
    static short s;
    static byte b;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bo;
    public static void main(String[] args) {
        System.out.println("int = "+i);
        System.out.println("short = "+s);
        System.out.println("byte = "+b);
        System.out.println("long = "+l);
        System.out.println("float = "+f);
        System.out.println("double = "+d);
        System.out.println("char = "+c);
        System.out.println("boolean = "+bo);
    }
}
