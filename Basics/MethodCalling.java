//! method is a set of statements which is used to perform some task
//! to execute method statements method calling is compulsory 
//! Ex:- methodName();
//! main method is called by JRE

public class MethodCalling {
    public static void main(String[] args) {
        System.out.println("main method starting ");
        m1();
        System.out.println("main method ends");
    }

    public static void m1() {
        System.out.println("m1 method starting");
        System.out.println("m1 method ends");
    }
}
