import java.util.Scanner;

public class barChart {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max =arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        /*for(int floor=max;floor>=1;floor--){
            for(int j=0;j<n;j++){
                if(arr[j]>=floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
*/
        //inverted bar chart
        for(int floor=1;floor<=max;floor++){
            for(int j=0;j<n;j++){
                if(arr[j]>=floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }

}