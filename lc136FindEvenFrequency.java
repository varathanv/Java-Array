

public class lc136FindEvenFrequency {

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 4, 4, 4};

        for (int i = 0; i < arr.length; i++) {

            int c = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    c++;
                }
            }

            if (c % 2 == 0) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}