//Moore's Voting Algorithm(time complexity O(N))

import java.util.Scanner;

public class majoriyEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(findMajorityEle(arr,n));
    }
    static int findMajorityEle(int[] a,int size){
        int count = 1; int res =0;
        for(int i=1;i<size;i++){
            if(a[res] == a[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                count =1;
                res = i;
            }
        }
        count =0;
        for(int i=0;i<size;i++){
            if(a[i]==a[res]){
                count++;
            }
        }
        if(count<=size/2){
            return -1;
        }

        return a[res];

    }
}
