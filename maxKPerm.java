public class maxKPerm {
    public int sortPermutation(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++) {
            if (i!=nums[i]) ans=ans&nums[i];
        }
        return (ans==-1)?0:ans;
    }
}
