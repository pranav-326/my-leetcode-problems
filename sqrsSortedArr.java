
import java.util.Arrays;

public class sqrsSortedArr {
    public static int[] sortedSquares(int[] nums) {
        int positivePointer=0;
        while (positivePointer<nums.length&&nums[positivePointer]<0) {
            positivePointer++;
        }
        int negetivePointer=positivePointer-1;
        int[] out=new int[nums.length];
        int counter=0;
        while (positivePointer<nums.length&&negetivePointer>=0) {
            int posSqr=nums[positivePointer]*nums[positivePointer];
            int negSqr=nums[negetivePointer]*nums[negetivePointer];
            if (posSqr>=negSqr) {
                out[counter]=negSqr;
                negetivePointer--;
            } else {
                out[counter]=posSqr;
                positivePointer++;
            }
            counter++;
        }
        while (negetivePointer>=0) {
            out[counter]=nums[negetivePointer]*nums[negetivePointer];
            negetivePointer--;
            counter++;
        }
        while (positivePointer<nums.length) {
            out[counter]=nums[positivePointer]*nums[positivePointer];
            positivePointer++;
            counter++;
        }
        return out;
    }
    public static void main(String[] args) {
        int[] a={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(a)));
    }
}