
import java.util.*;
public class lc643MaxAvgSubArr {
    public static void main(String[] args) {
        int s=0;
        int k=3;
        int[] a={1,2,3,4,5,6};
        for(int i=0;i<k;i++){
            s+=a[i];
        }
        int max=s;
        for(int i=k;i<a.length;i++){
            s=s-a[i-k]+a[i];
            max=Math.max(s,max);
        }
        System.out.print((double)max/k);
    }
}
