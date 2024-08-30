import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = scan.nextInt();
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxUnique = 0;
        int uniqueCount = 0;


        for (int i = 0; i < M; i++) {
            int num = nums[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) == 1) {
                uniqueCount++;
            }
        }

        maxUnique = uniqueCount;


        for (int i = M; i < N; i++) {

            int newNum = nums[i];
            freqMap.put(newNum, freqMap.getOrDefault(newNum, 0) + 1);
            if (freqMap.get(newNum) == 1) {
                uniqueCount++;
            }

            int oldNum = nums[i - M];
            freqMap.put(oldNum, freqMap.get(oldNum) - 1);
            if (freqMap.get(oldNum) == 0) {
                uniqueCount--;
                freqMap.remove(oldNum);
            }

            if (uniqueCount > maxUnique) {
                maxUnique = uniqueCount;
            }
        }

        System.out.println(maxUnique);
    }
}
