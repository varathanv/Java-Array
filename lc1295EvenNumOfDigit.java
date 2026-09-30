
public class lc1295EvenNumOfDigit{
    public static void main(String[] args) {
        int t=0;
        int[] a={44,55,89,678};
        for(int b:a){
            int s=0;
            while(b>0){
                s=s+1;
                b=b/10;
            }
                if(s%2==0){
                    t=t+1;
                }
            }
        System.out.print(t);
    }
}
