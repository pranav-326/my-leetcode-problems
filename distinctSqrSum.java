import java.util.HashSet;
import java.util.List;

public class distinctSqrSum {
    public int sumCounts(List<Integer> nums) {
        HashSet<Integer> s;
        int ans=0;
        for (int i = 0; i < nums.size(); i++) {
            s=new HashSet<>();
            for (int j = i; j < nums.size(); j++) {
                s.add(nums.get(j));
                ans+=(int)Math.pow(s.size(),2);
            }
        }
        return ans;
    }
}
