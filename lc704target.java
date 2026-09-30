
public class lc704target {
 public static void main(String[] args){
    int[] nums ={1,2,3,4,5,6,7,8};
    int l=0;
    int r=nums.length;
    while(l<=r){
        int target=7;
        int m = l+(r-l)/2;
        if(nums[m]==target){
            System.out.print(m);
        }
        else if(nums[m]<target){
            l=m+1;
        }
        else{
            r=m-1;
        }
        break;

    }

 }   
}
