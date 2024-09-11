import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputNums = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputNums[0]);
        int K = Integer.parseInt(inputNums[1]);
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        for (int i : nums) {
            if (i == K) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}