import java.util.*;
public class mergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length<=1) {
            return intervals;
        }
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> outputArray=new ArrayList<>();
        int[] currenInterval=intervals[0];
        outputArray.add(currenInterval);
        for (int[] i : intervals) {
            int currentEnd=currenInterval[1];
            int nextBegin=i[0];
            int nextEnd=i[1];
            if (currentEnd>=nextBegin) {
                currenInterval[1]=Math.max(nextEnd, currentEnd);
            } else {
                currenInterval=i;
                outputArray.add(currenInterval);
            }
        }

        return outputArray.toArray(new int[outputArray.size()][]);
    }
    public static void main(String[] args) {
        int[][] meh={{1,3},{2,6},{15,18},{8,10}};
        merge(meh);
    }
}
