public class SecLargestArr {
    public static void main(String[] args) {
        int[] arr = {3,2,7};
        int larg = 0;
        int secLarg =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                secLarg=larg;
                larg=arr[i];
            }
            else if(arr[i]>secLarg&&arr[i]!=larg){
                secLarg=arr[i];
            }
        }
        System.out.print(secLarg);
    }
}
