import java.util.*;

public class BuildArray {

    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3};

        int[] a = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(a));
    }
}