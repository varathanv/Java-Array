

public class lc219SmallestPairElement {
    public static void main(String[] args) {

        int arr[] = {2, 2, 4, 4, 6, 6};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
            }
        }

        System.out.println("Smallest pair element: " + min);
    }
}