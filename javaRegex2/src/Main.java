import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ReGex = "\\b(\\w+)(?:\\W+\\1\\b)+";

        String cumle = null;
        int cumleSayisi = scan.nextInt();
        String[] cumleler = new String[cumleSayisi];

        int i = 0;
        scan.nextLine();

        Pattern pattern = Pattern.compile(ReGex,Pattern.CASE_INSENSITIVE);
        while (i < cumleSayisi) {
            cumle = scan.nextLine();
            Matcher matcher = pattern.matcher(cumle);
            while (matcher.find()) {
                cumle = cumle.replaceAll(matcher.group(), matcher.group(1));
            }
            cumleler[i] = cumle;
            i++;
        }
        i = 0;
        while(i < cumleSayisi){
            System.out.println(cumleler[i]);
            i++;
        }
        scan.close();
    }
}
