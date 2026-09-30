import java.util.Arrays;

public class lc1475FinalPrices {
    public static void main(String[] args) {
        int[] arr = {12,1,12};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    arr[i]=arr[i]-arr[j];
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
