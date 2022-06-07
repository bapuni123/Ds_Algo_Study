import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nstar = n;
        for(int i=1;i<=n;i++){
            for(int j=nstar;j>=1;j--){
                System.out.print("*  ");
            }
            nstar--;
            System.out.println();
        }
    }
}
