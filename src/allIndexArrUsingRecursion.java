import java.util.Scanner;

public class allIndexArrUsingRecursion {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int[] iarr = allIndices(arr,x,0,0);

        for (int j : iarr) {
            System.out.println(j);
        }
    }
    public static int[] allIndices(int[] arr,int x,int idx,int fsf){
        if(idx==arr.length){
            return new int[fsf];
        }
        int[] iarr;
        if(arr[idx] == x){
            iarr = allIndices(arr,x,idx+1,fsf+1);
            iarr[fsf] = idx;
        }else{
            iarr = allIndices(arr,x,idx+1,fsf);
        }

        return iarr;
    }
}
