import java.util.Scanner;

public class firstIndexArrayUsingRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int x = sc.nextInt();
        int fi = firstIndex(arr,0,x);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr,int idx,int x){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        return firstIndex(arr,idx+1,x);
    }
}
