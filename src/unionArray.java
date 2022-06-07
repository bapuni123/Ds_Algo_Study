import java.util.HashSet;

public class unionArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;
        int[] b = {1,2,3};
        int m = b.length;
        System.out.println(doUnion(a,n,b,m));
    }
    public static int doUnion(int[] a, int n, int[] b, int m){
        HashSet<Integer>s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(a[i]);
        }
        for(int j=0;j<m;j++){
            s.add(b[j]);
        }
        return s.size();
    }
}
