package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class summaryIntervals {
    public static List<String> summaryRanges(int[] nums) {
        int start;
        ArrayList<String> out=new ArrayList<>();
        int i=0;
        while (i<nums.length) {
            start=nums[i];
            while (i<nums.length-1&&nums[i]+1==nums[i+1]) {
                i++;
            }
            if (start!=nums[i]) {
                out.add(Integer.toString(start)+"->"+Integer.toString(nums[i]));
            }
            else{
                out.add(Integer.toString(nums[i]));
            }
            i++;
        }
        return out;
    }
    public static void main(String[] args) {
        int[] arr=new int[100];
        for (int i = 1; i < 101; i++) {
            arr[i-1]=i;
        }
        System.out.println(summaryRanges(arr));
    }
}
