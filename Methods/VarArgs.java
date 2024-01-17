public class VarArgs {
    public static void main(String[] args) {
        m1(2,3,4,5);        
    }

    static void m1(int... a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
