public class ClosestToZero {
        public int findClosestNumber(int[] nums) {
            int closest=nums[0];
            for(int x:nums) {
                if (Math.abs(x)<Math.abs(closest)) {
                    closest=x;
                }
            }
            if (closest<0&&contains(nums,Math.abs(closest))) {
                return Math.abs(closest);
            }
            else {
                return closest;
            }
        }
        public boolean contains(int[] arr,int tar) {
            for (int i : arr) {
                if (i==tar) {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            ClosestToZero obj=new ClosestToZero();
            int[] arr={-1,3,-2};
            System.out.println(obj.findClosestNumber(arr));
        }
}
