

public class lc268MissingNum {
    public static void main(String[] args) {
        int[]arr={0,1,2,4};
        int n=arr.length;
        int a=n*(n+1)/2;
        int s=0;
        for(int b:arr){
            s+=b;
        }
        System.out.println(a);
        System.out.println(s);
        System.out.print(a-s);

    }
}
