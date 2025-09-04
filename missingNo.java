public class missingNo {
    public static int missingNumber(int[] nums) {
        int sumN=0;
        int max=nums.length;
        for (int i : nums) {
            sumN+=i;
        }
        int sum=(max*(max+1))/2;
        if (sum==sumN) {
            return 0;
        }
        return sum-sumN;
    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,2,4}));
    }
}
