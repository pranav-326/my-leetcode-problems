import java.util.HashMap;
import java.util.Scanner;

public class twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> comp=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            Integer compind=comp.get(nums[i]);
            if (compind != null) {
                return new int[]{compind,i};
            }
            comp.put(target-nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        twosum foo = new twosum();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len=in.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < len; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println("Enter the target value");
        int target=in.nextInt();
        int[] result = foo.twoSum(nums, target);
        System.out.println("{" +result[0] + "," + result[1] +"}");
        
        
    }
}