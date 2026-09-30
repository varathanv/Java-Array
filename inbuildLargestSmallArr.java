public class inbuildLargestSmallArr {
    public static void main(String[] args) {
        int[] arr = {3,7,2};
        int larg = Integer.MIN_VALUE;
        for(int x:arr){
            larg=Math.max(x,larg);
        }
        System.out.println(larg);

        int small = Integer.MAX_VALUE;
        for(int y:arr){
            small=Math.min(y,small);
        }
        System.out.println(small);
    }
}
