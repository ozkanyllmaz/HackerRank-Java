import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void extractTag(String tagStr, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tagStr);

        int count = 0;
        while (matcher.find() == true) {
            System.out.println(matcher.group(2));
            count++;
        }

        while (matcher.find() == false) {
            if (count == 0) {
                System.out.println("None");
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "<(.+?)>([^<>]+)</\\1>";
        int N = scan.nextInt();
        String tagStr = null;
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            tagStr = scan.nextLine();
            extractTag(tagStr, regex);
        }
    }
}