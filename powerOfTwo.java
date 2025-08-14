public class powerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // if (n>0) {
        //     for (int i = 0; i < 32; i++) {
        //         if (n==Math.pow(2, i)) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        //--------------------
        // int x=1;
        //     while(x<n)
        //         x*=2;
        // return x==n;
        //--------------------
        return n>0 && ((n&(n-1))==0);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32));
    }
}
