import java.util.*;
public class medianArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        double sum;
        if(n%2 !=0){
            return arr[n/2];
        }
        int i = n/2;
        int j= (n/2)-1;
        double a =arr[i];
        double b = arr[j];
        sum = (a+b)/2;

        return sum;
    }
}
