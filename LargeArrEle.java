public class LargeArrEle {
    public static void main(String[] args) {
        int[] arr = {3,5,7,4,5};
        int larg =0;
        for(int i=0;i<arr.length;i++){
            if(larg<arr[i]){
                larg=arr[i];
            }
        }
        System.out.print(larg);
    }
}
