import java.util.Scanner;

/**
 * Created by User on 22.11.2016.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter count of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = getFilledArrayByRandomWholeNumbers(n);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }

    private static int[] getFilledArrayByRandomWholeNumbers(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random()*n);
        }
        return arr;
    }
}
