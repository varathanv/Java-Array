import java.util.*;
public class swaparr {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int pos1 = 1;
        int pos2 = 3;
        int temp = arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
        System.out.print(Arrays.toString(arr));
    }
}
