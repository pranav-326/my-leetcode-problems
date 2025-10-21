
import java.util.HashMap;

public class twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m2=new HashMap<>();
        int[] out=new int[2];
        if (nums.length>=2) {
        for (int i = 0; i < nums.length; i++) {
            int curr=nums[i];
            if (m2.containsKey(target-curr)) {
                out[0]=m2.get(target-curr);
                out[1]=i;
                return out;
            } else {
                m2.put(curr, i);
            }
        }
        }
        if (out[0]==0&&out[1]==0) {
            return new int[0];
        }
        return out;
    }
}