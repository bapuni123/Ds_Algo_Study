import java.util.Scanner;

public class CountingDuplicates {
    static final int NO_OF_CHARS = 256;
    public static int duplicateCount(String text) {
        int result = 0;
        int[] count = new int[NO_OF_CHARS];
        for(int i = 0; i < text.length(); ++i){
            count[Character.toLowerCase(text.charAt(i))]++;
        }
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if(count[i] > 1) {
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = duplicateCount(s);
        System.out.println(ans);
    }
}
