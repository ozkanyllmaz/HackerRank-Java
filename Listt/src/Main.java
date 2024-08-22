import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void insertNum(int index, int num, ArrayList<Integer> arrayList) {
        if (index < 0) {
            return;
        } else if (index >= arrayList.size()) {
            arrayList.add(num);
        } else {
            arrayList.add(index, num);
        }
    }

    public static void deleteNum(int index, ArrayList<Integer> arrayList) {
        if (index < arrayList.size() && index >= 0) {
            arrayList.remove(index);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            arrayList.add(scan.nextInt());
        }

        int sorguSize = scan.nextInt();
        scan.nextLine();

        int index, num;
        String secim;

        for (int i = 0; i < sorguSize; i++) {
            secim = scan.nextLine().trim();

            switch (secim) {
                case "Insert":
                    index = scan.nextInt();
                    num = scan.nextInt();
                    if (scan.hasNextLine()) scan.nextLine();
                    insertNum(index, num, arrayList);
                    break;
                case "Delete":
                    index = scan.nextInt();
                    if (scan.hasNextLine()) scan.nextLine();
                    deleteNum(index, arrayList);
                    break;
                default:

                    break;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < arrayList.size(); j++) {
            result.append(arrayList.get(j));
            if (j < arrayList.size() - 1) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}
