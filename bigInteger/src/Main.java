import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = new BigInteger(String.valueOf(scan.nextBigInteger()));
        BigInteger num2 = new BigInteger(String.valueOf(scan.nextBigInteger()));

        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}