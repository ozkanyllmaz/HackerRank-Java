import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Kac arraylist olsun ? ");
        int N = scan.nextInt();

        ArrayList<Integer>[] arrayList = new ArrayList[N];


        for (int i = 0; i < N; i++) {
            //System.out.print("Arraylistin boyutu ne olsun ? :");
            int size = scan.nextInt();
            int deger = 0;
            arrayList[i] = new ArrayList<Integer>();
            //System.out.println("Array elemanlarini girin :");
            for (int j = 0; j < size; j++){
                deger = scan.nextInt();
                arrayList[i].add(deger);
            }
        }

        //System.out.print("Sorgu sayisi kac olsun ? :");
        //System.out.println(arrayList[0].get(4));
        int x = 0;
        int y = 0;
        int sorguSize = 0;
        if(scan.hasNextInt()){
            sorguSize = scan.nextInt();

        }

        for(int i = 0; i < sorguSize; i++){
            //System.out.print("x: ");
            x = scan.nextInt();
            //System.out.print("y: ");
            y = scan.nextInt();

            if (x > 0 && x <= N && y > 0 && y <= arrayList[x-1].size()) {
                System.out.println(arrayList[x-1].get(y-1));
            }else{
                System.out.println("ERROR!");
            }

            //System.out.println(arrayList[x].get(y));
        }

    }
}
