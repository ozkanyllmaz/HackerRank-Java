import java.util.*;

class Main {
    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = scan.nextLine().toLowerCase();
            String phoneNum = null;
            int phone = 0;
            do {
                phone = scan.nextInt();
                phoneNum = String.valueOf(phone);
            } while (phoneNum.charAt(0) == '0' && phoneNum.length() > 8);
            scan.nextLine();
            map.put(name, phone);
        }
        while (scan.hasNext()) {
            String str = scan.nextLine().toLowerCase();
            if (map.containsKey(str)) {
                System.out.println(str + "=" + map.get(str));
            } else {
                System.out.println("Not found");
            }
        }
    }
}



