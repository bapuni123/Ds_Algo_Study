import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(decimalToBinary(a));

    }
    public static int decimalToBinary(int a){
       if(a==0){
           return 0;
       }
       return  a%2 + 10*decimalToBinary(a/2);
    }

}
