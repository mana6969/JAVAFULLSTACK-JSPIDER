public class AddVarArgs {
    public static void main(String[] args) {
        System.out.println(add(2,3,4,5,6));
    }

    static int add(int... nums)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+= nums[i];
        }
        return sum;
    }
}
