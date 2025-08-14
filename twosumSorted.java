import java.util.Arrays;

public class twosumSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] out=new int[2];
        int left=0,right=numbers.length-1;
        while (right>left) {
            int sum=numbers[left]+numbers[right];
            if(sum>target) {
                right--;
            }
            else if(sum<target) {
                left++;
            }
            else if(sum==target) {
                out[0]=left+1;
                out[1]=right+1;
                return out;
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int[] out=twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(out));
    }
}
