public class convcCharOppCase {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("GeEkSfOrGeEkS");
        convcCharOppCase(str);
        System.out.println(str);
    }
    static void convcCharOppCase(StringBuffer str){
        int ln = str.length();
        for(int i=0;i<ln;i++){
            char c = str.charAt(i);
            if(Character.isLowerCase(c)){
                str.replace(i,i+1,Character.toUpperCase(c) + "");
            }else{
                str.replace(i,i+1,Character.toLowerCase(c) + "");
            }
        }
    }
}
