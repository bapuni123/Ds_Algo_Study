import java.util.HashSet;
import java.util.Scanner;

public class dupliEleKDist {

    static boolean checkDuplicatesWithinK(int[] arr,int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])) {
                return true;
            }else {
                set.add(arr[i]);
            }

            if(i>=k){
                set.remove(arr[i-k]);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of K:");
        int k = sc.nextInt();
        if (checkDuplicatesWithinK(arr,k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
