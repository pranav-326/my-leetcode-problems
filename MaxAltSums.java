import java.util.Arrays;

public class MaxAltSums {
    public long maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long sum=0;
        int i=0, j= nums.length-1;
        while (i<=j) {
            if (i==j) {
                sum+=nums[j--];
                break;
            }
            sum+=nums[j--];
            sum-=nums[i++];
        }
        return sum;
    }
}
