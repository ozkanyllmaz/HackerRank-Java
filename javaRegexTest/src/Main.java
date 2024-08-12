import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*while(true){
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            // telefon numarası tanımlama
            String regex = "(\\+90|0)?[5-9]{1}[0-9]{9}";


            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if(matcher.matches()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }*/
        // e-posta
        /*while(true){
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            String regex = "[\\w.-]+@[a-zA-Z]+\\.[a-zA-Z]{3}";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if(matcher.matches()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }*/
        String regex = "((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?|0)|([0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]))\\.((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?|0)|([0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]))\\.((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?|0)|([0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]))\\.((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?|0)|([0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]))";
        ArrayList<String> arrayList = new ArrayList<String>();


        while(true){
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            arrayList.add(input);



            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if(matcher.matches()){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}