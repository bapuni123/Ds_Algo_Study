import java.util.HashSet;

public class tripArrayZero {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;
        findTriplets(arr, n);
    }
    static void findTriplets(int[] arr, int n){
        boolean found = false;
        for(int i=0;i<n-1;i++){
            HashSet<Integer> s = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int x = -(arr[i] + arr[j]);
                if(s.contains(x)){
                    System.out.printf("%d %d %d\n", x, arr[i], arr[j]);
                    found = true;
                }else{
                    s.add(arr[j]);
                }
            }
        }
        if(!found){
            System.out.println("No Triplets found");
        }
    }
}
