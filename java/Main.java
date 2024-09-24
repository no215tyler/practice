import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if (nums[0] == nums[1]) {
        list.add(nums[0] * nums[1]);
      } else {
        list.add(nums[0] + nums[1]);
      }
    }

    int result = list.stream().mapToInt(Integer::intValue).sum();
    System.out.println(result);

    sc.close();
  }
}
