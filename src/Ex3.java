import java.util.Scanner;

/**
 * Created by User on 22.11.2016.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of elements in the array: ");
        int n = sc.nextInt();
        arr(n);
    }

    public static void arr(int n) {
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = (int)(Math.random()*n);
            System.out.print(arr1[i] + "\t");
        }
    }
}
