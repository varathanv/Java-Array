

import java.util.*;
public class lc231PowOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("FALSE");
        }
        while(n%2==0){
            n=n/2;
        }
        if(n==1){
            System.out.print("TRUE");
        }
        else{
            System.out.print("FALSE");
        }
    }   
}
