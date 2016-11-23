/**
 * Created by User on 22.11.2016.
 */
public class Ex5 {
    public static void main(String[] args) {
        int n = 7, m = 9;
        int[][] arr = new int[n][m];

        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int)(Math.random()*(n+m));
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int[] sumByEachRow = getSumByEachRow(arr);
        for (int i = 0; i < sumByEachRow.length; i++) {
            System.out.printf("Sum of %d row: %d\n", i+1, sumByEachRow[i]);
        }
    }

    private static int[] getSumByEachRow(int[][] matrix){
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arr[i] = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                arr[i] += matrix[i][j];
            }
        }
        return arr;
    }
}
