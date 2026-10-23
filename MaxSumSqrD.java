public class MaxSumSqrD {
    public String maxSumOfSquares(int num, int sum) {
//        int max=-1; int ans=-1;
//        for(int i=1;i<Math.pow(10,num);i++) {
//            int s=0; int score=0;
//            char[] c=Integer.toString(i).toCharArray();
//            for (int j = 0; j < c.length; j++) {
//                s+=Character.getNumericValue(c[j]);
//                score = (int) (score + Math.pow(c[j] - '0', 2));
//                if (j==c.length-1 && s==sum) {
//                    if (score>=max&&i>ans) {
//                        max=score;
//                        ans=i;
//                    }
//                }
//            }
//        }
//        return (ans==-1)?"":Integer.toString(ans);
        if (sum < 0 || sum > 9 * num) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
        }
        return sum == 0 ? ans.toString() : "";
    }
}
