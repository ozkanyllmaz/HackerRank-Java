import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            Scanner scan = new Scanner(System.in);
            BigInteger num = new BigInteger(String.valueOf(scan.nextBigInteger()));

            Boolean isPrime = num.isProbablePrime(1000000000);

            if(isPrime){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }

    }
}