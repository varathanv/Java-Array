
public class basicArr {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }   
}
