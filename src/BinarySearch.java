import java.util.Scanner;

public class BinarySearch {
    static int solve(int[] arr, int l, int r, int ele){
        if(l<=r){
           int mid = l+(r-l)/2;

           if(arr[mid]==ele)
               return mid;
           if(arr[mid]>ele)
               return solve(arr,mid+1,r,ele);
           if(arr[mid]<ele)
               return solve(arr,l,mid-1,ele);
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of the arry");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to check:");
        int ele = sc.nextInt();
       int ans = solve(arr,0,n-1,ele);
       if(ans==-1){
           System.out.println("Element is not present in the array");
       }else{
           System.out.println("Element found in index: "+ans);
       }
    }
}
