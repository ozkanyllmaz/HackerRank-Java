import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void isValidUsername(String username, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        if(matcher.find()){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        String username;
        String regex = "^(?![0-9\\_\\@\\?\\{\\}\\[\\]\\$])[a-zA-Z0-9_]{8,30}$";

        N = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < N; i++){
            username = scan.nextLine();
            isValidUsername(username,regex);
        }
    }
}