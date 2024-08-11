import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String data=String.valueOf(n);
        if(data.isEmpty()) {
            System.out.println("Wrong answer");
        }else{
            System.out.println("Good job");
        }
    }
}