
import java.util.Arrays;

public class RightRotate {
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(i<k){
                arr[i] = nums[n+i-k];
            }else{
                arr[i] = nums[i-k];
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){
        int[] Array = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(Array,k);
    }
}
