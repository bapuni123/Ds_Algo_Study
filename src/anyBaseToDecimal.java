import java.util.*;

public class anyBaseToDecimal{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        // write your code here
        int  res = 0;
        int count = 0;
        while(n!=0){
            int d = n%10;
            res+=d*Math.pow(b,count);
            count++;
            n = n/10;
        }
        return res;
    }
}