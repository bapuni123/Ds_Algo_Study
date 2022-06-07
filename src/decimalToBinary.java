import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }
    public static int getValueInBase(int n, int b){
        int count = 0;
        int res = 0;
        while(n!=0){
            int d = n%b;
            res+= d*Math.pow(10,count);
            count++;
            n = n/b;
        }
        return res;
    }
}
