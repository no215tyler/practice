import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strNums = sc.nextLine().split(" ");
    int[] nums = new int[strNums.length];
    for (int i = 0; i < strNums.length; i++) {
      nums[i] = Integer.parseInt(strNums[i]);
    }
    int D = nums[0] - nums[1];
    int P = nums[0] * nums[1];
    System.out.println(String.format("%d %d", D, P));
  }
}
