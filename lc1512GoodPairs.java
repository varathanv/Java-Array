
public class lc1512GoodPairs {
    public static void main(String[] args) {
        int[] a={1,0,1,4,1,3,4};
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c=c+1;
                }
            }
        }
        System.out.print(c);
    }
    
}
