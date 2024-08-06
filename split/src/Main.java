import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String str = scan.nextLine();
        String regex = "[ \\!\\,\\?\\.\\_\\'\\@]+";

        String[] mystrArray = str.trim().split(regex);
        for(String s : mystrArray){
            count++;
        }
        if(str.trim().isEmpty()){
            count = 0;
        }
        System.out.println(count);
        for(String s : mystrArray){
            System.out.println(s);
        }
    }
}