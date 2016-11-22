import java.util.Scanner;

/**
 * Created by User on 22.11.2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of rows in the table: ");
        int a = sc.nextInt();
        System.out.print("Enter count of columns in the table: ");
        int b = sc.nextInt();
        multiplicationTable(a, b);
    }

    public static void multiplicationTable(int x, int y){
        for (int i = 1; i < x+1; i++) {
            for (int j = 1; j < y+1; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    };
}
