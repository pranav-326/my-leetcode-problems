import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class LongestConsSeq {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        if(nums.length==0) return 0;
        for (int num : nums) {
            s.add(num);
        }
        int count=0;
        int len=0;
        for (int num : s) {
            if (!s.contains(num-1)) {
                while (s.contains(num+count)) {
                    count++;
                }
                len=Math.max(count,len);
            }

        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}
