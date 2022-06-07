import java.util.*;

public class anyBaseToAnyBase{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int res1 =0;
        int count1 =0;
        while(n!=0){
            int d = n%10;
            res1+=d*Math.pow(sourceBase,count1);
            count1++;
            n = n/10;
        }
        int res2 =0;
        int count2 = 0;
        while(res1!=0){
            int d1 = res1%destBase;
            res2+=d1*Math.pow(10,count2);
            count2++;
            res1 = res1/destBase;
        }
        System.out.println(res2);
    }
}