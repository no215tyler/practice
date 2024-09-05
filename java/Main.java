import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < N; i++) {
        String[] nums = sc.nextLine().split(" ");
        for (int j = 1; j < nums.length; j++) {
            System.out.print(nums[j]);
            if (j == nums.length - 1) {
              System.out.println();
            } else {
              System.out.print(" ");
            }
        }
    }

    sc.close();
  }
}
