import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[5];
    for (int i = 0; i < 5; i++) {
      nums[i] = sc.nextInt();
    }
    int result = nums[0];
    for (int num : nums) {
      if (result > num) {
        result = num;
      }
    }
    System.out.println(result);
    sc.close();
  }
}
