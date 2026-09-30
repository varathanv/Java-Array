public class MaxSumArr {
    public static void main(String[] args) {
        int[] arr = {4,2,7,1,8,};
        int k=2;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max = sum;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k];
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
        }
        System.out.print(max);
        }
}
