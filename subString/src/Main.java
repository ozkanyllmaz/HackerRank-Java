import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str_index = scan.nextLine();
        String[] words = str_index.split(" ");
        int index1 = 0;
        int index2 = 0;

            index1 = (Integer.parseInt(words[0]));
            index2 = (Integer.parseInt(words[1]));

        //index1 = Character.getNumericValue(str_index.charAt(0));
        //int index2 = Character.getNumericValue(str_index.charAt(2));

        System.out.println(str.substring(index1, index2));

    }
}