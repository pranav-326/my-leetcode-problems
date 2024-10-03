import java.util.*;
public class romtonum {
    int value(char ch) {
        if(ch=='I')
            return 1;
        if (ch=='V') 
            return 5;
        if(ch=='X')
            return 10;
        if (ch=='L')
            return 50; 
        if (ch=='C') 
            return 100;
        if (ch=='D')
            return 500;
        if (ch=='M')
            return 1000;
        return -1;
    }
    int conromtoint(String s) {//viii,len=4
        int total=0;
        for (int i = 0; i < s.length(); i++) {
            int i1=value(s.charAt(i));//5,1,1,1
            if (i+1<s.length()) {//yes,yes,yes,no
                int i2=value(s.charAt(i+1));//1,1,1
                if (i1>i2||i1==i2) {//yes,yes,yes
                    total=total+i1;//5,6,7
                }
                else {
                    total=total-i1;
                }
            }
            else {
                total=total+i1;//8
            }
        }
        return total;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        romtonum r=new romtonum();
        System.out.println("Enter the roman numeral");
        String stemp=in.nextLine();
        String s1=stemp.toUpperCase();
        System.out.println("The corresponding integer value is "+r.conromtoint(s1));
    }
}
