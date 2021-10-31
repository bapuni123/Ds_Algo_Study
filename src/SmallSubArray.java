//Smallest sub array with all occurrences of a most frequent element

import java.util.HashMap;
import java.util.Scanner;

public class SmallSubArray {
    static void smallestSubsegment(int[] a, int n){
        HashMap<Integer,Integer> left = new HashMap<>();
        HashMap<Integer,Integer> count = new HashMap<>();

        int mx = 0;
        int mn =-1,strindex = -1;

        for(int i=0;i<n;i++){
            int x = a[i];
            if(count.get(x)==null){
                left.put(x,i);
                count.put(x,1);
            }else{
                count.put(x,count.get(x)+1);
            }if(count.get(x)>mx){
                mx = count.get(x);

                mn = i-left.get(x)+1;
                strindex = left.get(x);
            }else if((count.get(x)==mx)&&(i-left.get(x)+1<mn)){
                mn = i-left.get(x)+1;
                strindex = left.get(x);
            }
        }
        for(int i=strindex;i<strindex+mn;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        smallestSubsegment(arr,n);
    }
}
