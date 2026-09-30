
import java.util.*;
public class lc11ContainerWithMostWater  {
    public static void main(String[] args) {
        int[] a={8,1,2,5,8};
        int l=0;
        int r=a.length-1;
        int max=0;
        for(int i=0;i<a.length;i++){
            int c=Math.min(a[l],a[r]*(r-l));
            max=Math.max(c,max);
            if(a[l]<a[r]){
                l++;
            }
            else{
                r--;
            }
        }
            System.out.print(max);
            
    }
    
}
