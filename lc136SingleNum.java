

import java.util.*;
public class lc136SingleNum {
    public static void main(String[] args) {
        int[] nums={1,2,1,2,4};
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c=c+1;
                }
            }
            if(c==1){
                System.out.print(nums[i]);
            }
        }
    }
}
