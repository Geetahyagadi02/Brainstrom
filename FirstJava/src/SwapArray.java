import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }



}
