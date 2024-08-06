import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import static java.util.regex.Pattern.compile;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        int i = 0;
        String[] testCase = new String[N];

        while (i < N) {
            testCase[i] = scan.nextLine();
            i++;
        }
        i=0;
        while(i < N) {
            try{
                Pattern.compile(testCase[i]);
                System.out.println("Valid");

            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            i++;
        }
    }
}