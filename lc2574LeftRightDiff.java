import java.util.*;
public class lc2574LeftRightDiff {
    public static void main(String[] args) {
        int[] nums = {4,1,2};
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int l=0;
            int r=0;
            for(int j=0;j<i;j++){
                l+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                r+=nums[j];
            }
            int ab = Math.abs(l-r);
            arr[i]=ab;
        }
        System.out.print(Arrays.toString(arr));
    }
}
