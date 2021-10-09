public class LinearSearch {

    static void search(int[] arr,int ele){
        int left = 0;
        int length = arr.length;
        int right = length-1;
        int position = -1;
        for(left=0; left<=right;){
            if(arr[left]==ele){
                position = left;
                System.out.println("Element found in Array at "+ (position+1)
                 + " Position with "+ (left+1) + " Attempt");
                break;
            }
            if(arr[right]==ele){
                position = right;
                System.out.println("Element found in Array at "+ (position+1)
                        + " Position with "+ (length-right) + " Attempt");
                break;
            }
            left++;
            right--;
        }
    }


    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5 };
        int search_element = 5;
        search(arr,search_element);
    }
}
