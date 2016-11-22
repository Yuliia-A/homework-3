
/**
 * Created by User on 22.11.2016.
 */
public class Ex4 {
    public static void main(String[] args) {
        int n = 15;
        int[] arr1 = new int[n];
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = (int)(Math.random()*n);
            System.out.print(arr1[i] + "\t");
        }
        System.out.println("\nMin = " + minOfArr(arr1));
    }

    public static int minOfArr(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
