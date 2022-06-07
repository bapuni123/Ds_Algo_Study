import java.util.Scanner;

public class recurReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverse(s));
    }
    public static String reverse(String str){
        if(str.isEmpty()){
            return  str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
