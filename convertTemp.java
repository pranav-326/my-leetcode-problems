package LeetCode;

import java.util.Arrays;

/**
 * convertTemp
 */
public class convertTemp {
    public static double[] convertTemperature(double celsius) {
        double[] out=new double[2];
        out[0]=celsius+273.15;
        out[1]=(celsius*1.8)+32;
        return out;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }
}