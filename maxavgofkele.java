public class maxavgofkele {
    public static double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int maxsum=sum;
        for (int i = k; i < nums.length; i++) {
            sum-=nums[i-k];
            sum+=nums[i];
            maxsum=Math.max(maxsum, sum);
        }
        return (double)maxsum/k;   
    }
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
}
