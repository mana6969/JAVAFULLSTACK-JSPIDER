//! If we want to call any static variable from another class then we must have to call by the class name
class Test {
    static int i=9;
}
class StaticVariable7 {
    public static void main(String[] args) {
        System.out.println(Test.i);
    }
}