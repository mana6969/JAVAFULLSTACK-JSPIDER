//! The varibles which is defined inside a class outside a method without static keyword is known as Non-static variable.
//! To refer non-static variables object creation is compulsory.
//! Object is created by using new keyword.
//! Ex:- new className();
//! className objectName = new className();

public class NonStaticVariable1 {
    int a = 1;
    int b = 2;

    public static void main(String[] args) {
        NonStaticVariable1 ns;
        ns = new NonStaticVariable1();
        System.out.println(ns.a);
        System.out.println(ns.b);
    }
}
