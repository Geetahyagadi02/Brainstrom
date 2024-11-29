public class ArraySum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        arraySum(arr);
    }

    private static void arraySum(int[] arr) {
        int sum = 0;
        for (int i:arr){
            sum+=i;
        }
        System.out.println(sum);
    }
}
