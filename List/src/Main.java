import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void insertNum(int index, int num, int size, ArrayList arrayList) {
        if (index > size) {
            arrayList.add(num);
        } else {
            arrayList.add(index, num);
        }

    }

    public static void deleteNum(int index, ArrayList arrayList) {
        if (index <= arrayList.size()) {
            arrayList.remove(index);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < size; i++) {
            arrayList.add(scan.nextInt());
        }

        int sorguSize = scan.nextInt();
        scan.nextLine();
        int index = 0;
        int num = 0;
        String secim = null;

        for (int i = 0; i < sorguSize; i++) {
            secim = scan.nextLine();
            switch (secim) {
                case "Insert":
                    index = scan.nextInt();
                    num = scan.nextInt();
                    scan.nextLine();
                    insertNum(index, num, arrayList.size(), arrayList);
                    break;
                case "Delete":
                    if (arrayList.size() >= index) {
                        index = scan.nextInt();
                        deleteNum(index, arrayList);
                    }
                    break;
            }
        }
        for (int j : arrayList) {
            System.out.print(j + " ");
        }
    }
}