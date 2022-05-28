import java.util.*;

public class SumOfTwoArray{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int j=0;j<n2;j++){
            arr2[j] = sc.nextInt();
        }
        int[] res = new int[Math.max(n1, n2)];

        if(n1>n2){
            res[0] = arr1[0];
            for(int i=1;i<n2;i++){
                res[i] = arr1[i] + arr2[i];
            }
        }else{
            res[0] = arr2[0];
            for(int i=0;i<n1;i++){
                res[i+1] = arr1[i] + arr2[i+1];
            }
        }

        //System.out.println(Arrays.toString(res));
        for (int re : res) {
            System.out.println(re);
        }
    }
}
