
import java.util.*;

class practice {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int N;
        N = s.nextInt();

        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }
        // Write your code here
        String ans ;
        String s1= "";
        for (int datum : data) {
            int r = datum % 10;
            s1 += Integer.toString(r);
        }
        int res = Integer.parseInt(s1);
        if(res%10==0){
            ans="Yes";
        }else{
            ans="No";
        }


        System.out.println(ans);
        //return 0;
    }
}