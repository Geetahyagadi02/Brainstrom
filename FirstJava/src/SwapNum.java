import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapNum(a,b);
        System.out.println("numbers  to be swapped a="+a+" b=  "+b);
    }

    private static void swapNum(int i, int i1) {
        int temp = i;
        i = i1;
        i1 = temp;
        System.out.println("swapped numbers a="+i+" b=  "+i1);
    }


}
