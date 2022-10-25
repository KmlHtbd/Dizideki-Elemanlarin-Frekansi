import java.util.Arrays;
public class ArrayFrequence {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            freq[i] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    freq[i]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    arr[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] >= 1) {
                if (arr[i] != 0)
                    System.out.println(arr[i] + " sayisi " + freq[i] + " kere tekrar edildi.");
            }
        }
    }
}