import java.util.HashSet;

public class arrayPairSum {

    static void printpairs(int[] arr, int sum){
        HashSet<Integer> s = new HashSet<>();

        for (int j : arr) {
            int temp = sum - j;

            if (s.contains(temp)) {
                System.out.println("pair with given sum " + sum + " is (" +
                        j + ", " + temp + ") ");
            }

            s.add(j);
        }
    }

    public static void main(String[] args){
        int[] A = {1,4,45,6,10,8};
        int n = 16;
        printpairs(A,n);
    }
}
