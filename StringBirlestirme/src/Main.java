import java.util.Scanner;

public class Main {

    public static int stringBoyutHesapla(String A, String B){
        int boyutA = A.length();
        int boyutB = B.length();
        return boyutA+boyutB;
    }

    public static String stringBuyukMu(String A, String B){
        String no = "No";
        String yes = "Yes";
        if(A.charAt(0) > B.charAt(0)){
            return yes;
        }else{
            return no;
        }
    }
    public static String stringBirlestir (String A, String B){
        String newA = A.toUpperCase().charAt(0)+A.substring(1);
        String newB = B.toUpperCase().charAt(0)+B.substring(1);

        return newA.concat(" "+ newB);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();

        System.out.println(stringBoyutHesapla(A,B));
        System.out.println(stringBuyukMu(A,B));
        System.out.println(stringBirlestir(A,B));

    }
}