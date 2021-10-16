//time complexity of this algorithm is o(n)
import java.util.Scanner;

public class cyclicSort {
    public static void printArray(int[] arr,int N){
        for (int i =0;i<N;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void sortArray(int[] arr, int N){
        int x = Integer.MAX_VALUE;
        for(int j=0;j<N;j++){
            if((arr[j]<x)){
                x = arr[j];
            }
        }
        for(int i=0;i<N;){
            if(arr[i]==i+x){
                i++;
            }else{
                int temp1 = arr[i];
                int temp2 = arr[arr[i]-x];
                arr[i] = temp2;
                arr[temp1-x] = temp1;
            }
        }
    }
    public static void main(String[] args){

        //take input array from 1 to N in any order
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr,N);
        printArray(arr,N);


    }
}
