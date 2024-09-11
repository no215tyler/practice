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

      for (int num : nums) {
        System.out.println(num + K);
      }

      sc.close();
    }
}