import java.util.Scanner;
public class sumPal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isDigitSumPalindrome(n));
    }
    static int isDigitSumPalindrome(int N) {
        int sum =0;
        while(N>0){
            int r = N%10;
            sum = sum+r;
            N = N/10;
        }
        int rev = 0;
        int tmp = sum;
        while(tmp>0){
            int rem = tmp%10;
            rev = rev*10+rem;
            tmp = tmp/10;
        }
        if(rev==sum ){
            return 1;
        }else{
            return 0;
        }
    }
}
