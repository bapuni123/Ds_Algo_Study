import java.util.Scanner;

public class moveAllNegativeEleToEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        segregateElements(arr, n);
    }

    public static void segregateElements(int[] arr, int n) {
        // Your code goes here
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > -1) {
                a[count++] = arr[i];

            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                a[count++] = arr[j];
                //count++;
            }
        }
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}

