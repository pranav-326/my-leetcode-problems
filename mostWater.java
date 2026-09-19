public class mostWater {
    public static int maxArea(int[] height) {
        int maxarea=Integer.MIN_VALUE;
        int i=0,j=height.length-1;
        while (j>i) {
            int area=(j-i)*Math.min(height[i],height[j]);
            maxarea=Math.max(maxarea,area);
            if (height[i]>height[j]) j--;
            else i++;
        }
        return maxarea;
    }
}
/*
int maxarea=Integer.MIN_VALUE;
for (int i = 0; i < height.length; i++) {
    for (int j = i; j < height.length; j++) {
        int area=(j-i)*Math.min(height[i],height[j]);
        System.out.println(area);
        maxarea = Math.max(area, maxarea);
        }
    }
        return maxarea;
 */