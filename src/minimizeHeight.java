public class minimizeHeight {
    public static void main(String[] args) {
     int[] arr = {1, 5, 8, 10};
     int n = arr.length;
     int k =2;
        System.out.println(getminiDiff(arr,n,k));
    }

    static int getminiDiff(int[] arr, int n, int k){
        int max = arr[n-1];
        int min = arr[0];
        int res = max-min;
        for(int i=1;i<n;i++){
            max = Math.max(arr[i-1]+k, arr[n-1]-k);
            min = Math.min(arr[i]-k,arr[0]+k);
            if(min<0)continue;
            res = Math.min(res,max-min);
        }

        return res;
    }
}
