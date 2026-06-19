import java.util.*;
public class kthLargest {
    public static String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (a,b) -> {
            if(a.length()!=b.length()) {
                return a.length()-b.length();
            } 
            return a.compareTo(b);
        });
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        System.out.println(kthLargestNumber(new String[]{"577725","387","908","2","1","3312038","60997700","960084840","721182339","554615679","4410","76","9700217","6918033","8401489025"}, 1));
    }
}
