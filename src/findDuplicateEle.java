// Find duplicates in a given array when elements are not limited to a range

import java.util.ArrayList;

public class findDuplicateEle {
    static void findDuplicates(int[] arr, int len){
        boolean ifPresent = false;

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i] == arr[j]){
                    if(al.contains(arr[i])){
                        break;
                    }else{
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }
        if(ifPresent){
            System.out.println(al + " ");
        }else{
            System.out.println("No duplicates present in arrays");
        }
    }
    public static void main(String[] args){
        int[] arr = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
        int n = arr.length;

        findDuplicates(arr, n);
    }
}
