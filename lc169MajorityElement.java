

import java.util.*;
public class lc169MajorityElement {
    public static void main(String[] args) {
        int[] a={1,2,3,3,3,4,5,8};
        Arrays.sort(a);
        System.out.print(a[a.length/2]);
    }    
}
