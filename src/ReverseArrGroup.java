public class ReverseArrGroup {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k =3;
        reverseInGroups(arr,n,k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void reverseInGroups(int[] arr, int n, int k){
         k = k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    static void reverse(int[] arr, int start, int end){
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
