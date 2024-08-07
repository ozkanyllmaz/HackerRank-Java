import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static boolean isAnagram(String A, String B) {
        int i = 0;
        boolean b = false;
        A.toLowerCase();
        B.toLowerCase();
        HashMap<Character, Integer> anagram = new HashMap<>();
        HashMap<Character, Integer> anagram2 = new HashMap<>();
        for (char c : A.toLowerCase().toCharArray()) {
            anagram.put(c, anagram.getOrDefault(c, 0) + 1);
        }
        //-------------------------
        for (char c : B.toLowerCase().toCharArray()) {
            anagram2.put(c, anagram2.getOrDefault(c, 0) + 1);
        }

        while(i < anagram.size()){
            if(anagram.entrySet().equals(anagram2.entrySet())){
                b = true;
            }
            i++;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();
        if(isAnagram(A, B)== true){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}