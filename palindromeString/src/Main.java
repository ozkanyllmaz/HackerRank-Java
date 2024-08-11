import java.util.Scanner;

public class Main {

    public static int isPalindrom(String A, int mid){
        int i = 0;
        int a = 0;
        for(i = 0; i < mid; i++){
            if(A.charAt(i) == A.charAt(A.length()-1-i)){
                a++;
            }else{
                return -2;
            }
        }
        if(a == i)
            return 2;
        return 2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        int mid = A.length() / 2;
        if(isPalindrom(A,mid) > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}