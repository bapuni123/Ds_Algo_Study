import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofdigits(n));
    }
    public static int sumofdigits(int n){
        if(n==0 || n<0){
            return 0;
        }
        return (n%10) + sumofdigits(n/10);
    }
}
