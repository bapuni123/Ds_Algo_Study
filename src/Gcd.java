import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));

    }
    public static int gcd(int a, int b){
        if(a<0 || b<0){
            return -1;
        }if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
