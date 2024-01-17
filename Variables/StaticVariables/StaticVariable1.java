//! The varibles which is defined inside a class outside a method with static keyword is known as static variable.
//! For static variable only one memory is assigned. so, at any time we can reassign the values.
public class StaticVariable1 {
    static int i=12;
    public static void main(String[] args) {
        System.out.println(i);
        i=66;
        System.out.println(i);
        i=89;
        System.out.println(i);
    }
}
