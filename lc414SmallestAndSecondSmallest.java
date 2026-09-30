
import java.util.*;

public class lc414SmallestAndSecondSmallest {

    public static void main(String[] args) {

        int[] arr = {9, 7, 5, 3, 1};

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondsmallest) {
                secondsmallest = arr[i];
            }
        }

        System.out.print(secondsmallest);
        System.out.println();
        System.out.print(smallest * secondsmallest);
    }
}