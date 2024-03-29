import java.util.*;

public class printAllPalindromeString {
    public static void solution(String str){
        //write your code here
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String ss = str.substring(i,j);

                if(isPalindrome(ss)){
                    System.out.println(ss);
                }
            }
        }

    }

    public static boolean isPalindrome(String s){
        int i =0;
        int j = s.length()-1;
        while(i<=j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1!=c2){
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}
