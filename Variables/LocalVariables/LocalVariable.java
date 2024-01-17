public class LocalVariable {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        m1();
    }
    public static void m1() {
        int m = 59;
        System.out.println(m);
    }
}
//! The variables which are created inside the method those are local variables 
//! Local variables can't be used for any operation without initialization