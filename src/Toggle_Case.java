import java.io.*;
import java.util.*;

public class Toggle_Case {

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)>='a' && sb.charAt(i)<='z'){
                char uch = (char)('A'+sb.charAt(i)-'a');
                sb.setCharAt(i,uch);
            }else if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
                char lch = (char) ('a'+sb.charAt(i)-'A');
                sb.setCharAt(i,lch);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}