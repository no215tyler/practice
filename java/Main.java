import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] nums = {0, 1};
    for (int i = 0; i < N; i++) {
      System.out.println(nums[0]);
      int buf = nums[0] + nums[1];
      nums[0] = nums[1];
      nums[1] = buf;
    }
  }
}