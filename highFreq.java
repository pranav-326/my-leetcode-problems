
import java.util.*;

public class highFreq {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m1=new HashMap<>();
        int max=0,out = 0;
        for (int i : nums) {
            m1.put(i, m1.getOrDefault(i, 0)+1);
            if (m1.get(i)>max) {
                max=m1.get(i);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
        if (entry.getValue().equals(max)) {
            out=entry.getKey();
            }
        }
        if (max>nums.length/2) {
            return out;
        }
        return 0;
    }
}
