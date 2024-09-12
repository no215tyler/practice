import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int[] nums = new int[N];

      for (int i = 0; i < N; i++) {
        nums[i] = sc.nextInt();
      }

      boolean flg = false;
      for (int num : nums) {
        if (num == 0) {
          flg = true;
        }
      }

      if (flg == true) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }

      sc.close();
    }
}