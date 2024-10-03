import java.util.*;
public class sumofdig {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = in.nextInt();
        int dig, sum=0;
        while (no>0) {
            dig=no%10;
            sum+=dig;
            no=no/10;
        }
        System.out.println("Sum of digits is "+sum);
    }
}
