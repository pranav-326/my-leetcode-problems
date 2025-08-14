
import java.util.Arrays;

/**
 * prdctExcpSelf
 */
public class prdctExcpSelf {
    public static int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] out=new int[nums.length];
        out[0]=1;
        for (int i = 1; i < len; i++) {
            out[i]=out[i-1]*nums[i-1];
        }
        int prd=1;
        for (int i = len-1; i>=0; i--) {
            out[i]=prd*out[i];
            prd=prd*nums[i];
        }
        return out;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}