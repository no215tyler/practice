import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] strNums = sc.nextLine().split(" ");
    int[] nums = new int[N];
    for (int i = 0; i < N; i++) {
      nums[i] = Integer.parseInt(strNums[i]);
    }

    for (int num : nums) {
      for (int i = 1; i <= num; i++) {
        if (i == num) {
          System.out.println(i);
        } else {
          System.out.print(i + " ");
        }
      }
    }

    sc.close();
  }
}