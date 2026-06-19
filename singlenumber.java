public class singlenumber {
    public static int singleNumber(int[] nums) {
        int res=0;
        for (int i : nums) {
            res=res^i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,2,3,2,3}));
    }
}
