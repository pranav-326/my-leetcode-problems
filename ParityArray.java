public class ParityArray {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        boolean hasEven=false;
        for (int i : nums1) {
            if (i<min&&i%2==1) min=i;
            else hasEven=true;
        }
        if (!hasEven) return true;
        int[] nums2=nums1.clone();
        for (int x : nums1) {
            if (x % 2 == 0 && x < min) {
                return false;
            }
        }
        return true;
    }
}
/*
class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : nums1) {

            if (num % 2 == 0) {
                minEven = Math.min(minEven, num);
            } else {
                minOdd = Math.min(minOdd, num);
            }
        }

        if (minOdd == Integer.MAX_VALUE || minEven == Integer.MAX_VALUE) {
            return true;
        }

        return minOdd < minEven;
    }
}
 */