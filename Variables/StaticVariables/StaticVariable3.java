//! In a class if same name local and static variable is present then java give priority to local variables
public class StaticVariable3 {
    static int i=10;
    public static void main(String[] args) {
        System.out.println(i);
        int i=59;
        System.out.println(i);
    }
}
