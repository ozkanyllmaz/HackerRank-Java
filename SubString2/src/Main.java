import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int index = scan.nextInt();
        int i = 1;
        String max = str.substring(0, index);
        String min = str.substring(0, index);

        while (i <= str.length() - index) {
            String substr = str.substring(i, i + index);
            if(substr.compareTo(min) < 0){
                min = substr;
            }
            if(substr.compareTo(max) > 0){
                max = substr;
            }
            i++;

        }
        System.out.println(min);
        System.out.println(max);
    }
}

