
import java.util.*;

public class threeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out=new ArrayList<>();
        Arrays.sort(nums);
        // for (int i = 0; i < nums.length-2; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         for (int k = j+1; k < nums.length; k++) {
        //             // if(i>0&&nums[i]!=nums[i-1]) continue;
        //             if (nums[i]+nums[j]+nums[k]==0&&!out.contains(Arrays.asList(nums[i],nums[j],nums[k]))) {
        //                 out.add(Arrays.asList(nums[i],nums[j],nums[k]));
        //             }
        //         }
        //     }    
        // }
        for (int i = 0; i < nums.length; i++) {
            if(i>0&&nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int l=i+1,r=nums.length-1;
            while(r>l) {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum>0) r--;
                else if(sum<0) l++;
                else {
                    out.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r&&nums[l]==nums[l-1]) {
                        l++;
                    }
                }
            }
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}

