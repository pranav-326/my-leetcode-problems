import java.util.*;
public class topkfreq {
    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket=new List[nums.length+1];
        Map<Integer,Integer> m=new HashMap<>();
        for (int i : nums) {
            m.put(i, m.getOrDefault(i, 0)+1);
        }
        for (int key : m.keySet()) {
            int f=m.get(key);
            if (bucket[f]==null) {
                bucket[f]=new ArrayList<>();
            }
            bucket[f].add(key);
        }
        int[] res=new int[k];
        int c=0;
        for(int i=nums.length-1;i>=0&&c<k;i--) {
            if (bucket[i]!=null) {
                for (Integer in : bucket[i]) {
                    res[c++]=in;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Map<Integer,Integer> m=new HashMap<>();
        int nums[]={1,2,3,4,5,2,5,5};
        for (int i : nums) {
            m.put(i, m.getOrDefault(i, 0)+1);
        }
        System.out.println(m);
    }
}
