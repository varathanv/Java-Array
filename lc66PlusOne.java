

import java.util.*;

public class lc66PlusOne {

    public static void main(String[] args) {

        int[] digits = {1, 2, 9};

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                break;
            }

            digits[i] = 0;

            if (i == 0) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                digits = result;
            }
        }

        System.out.println(Arrays.toString(digits));
    }
}