import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                do {
                    a[i][j] = scan.nextInt();
                } while (a[i][j] < -9 && a[i][j] > 9);
            }
        }

        int sum = 0;
        int[] max = new int[16];
        int x = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                max[x] = a[i][j] + a[i + 2][j] + a[i][j + 1] + a[i + 2][j + 1] + a[i][j + 2] + a[i + 2][j + 2] + a[i + 1][j + 1];
                x++;
            }
        }
        int maximum = max[0];
        for (int i = 1; i < 16; i++) {
            if(max[i] > maximum){
                maximum = max[i];
            }
        }
        System.out.println(maximum);
    }
}