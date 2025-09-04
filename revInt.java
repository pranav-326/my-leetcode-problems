public class revInt {
    public static int reverse(int x) {
        int r=0;
        while (x!=0) {
            int d=x%10;
            x/=10;
            if (r>Integer.MAX_VALUE/10||(r==Integer.MAX_VALUE&&d>7)) {
                return 0;
            }
            if (r<Integer.MIN_VALUE/10||(r==Integer.MIN_VALUE&&d<-8)) {
                return 0;
            }
            r=(r*10)+d;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
