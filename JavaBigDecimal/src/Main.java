import java.math.BigDecimal;
import java.util.*;

class Main {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        BigDecimal[] bgArray = new BigDecimal[n + 2];


        for (int i = 0; i < n; i++) {
            try {
                bgArray[i] = new BigDecimal(s[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        BigDecimal bgTemp = null;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bgArray[j].compareTo(bgArray[j + 1]) < 0) {
                    // swap temp and arr[i]
                    bgTemp = bgArray[j];
                    bgArray[j] = bgArray[j + 1];
                    bgArray[j + 1] = bgTemp;

                    String tempStr = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = tempStr;

                }
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}