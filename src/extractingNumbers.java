import java.io.BufferedReader;
import java.io.InputStreamReader;

public class extractingNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solve(s));
    }
    public static Long solve(String A  ){
        long sum =0, num =0;
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }else{
                sum+=num;
                num = 0;
            }
        }

        return sum+num;
    }
}
