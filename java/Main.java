import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] nums = Arrays.stream(sc.nextLine()
                      .split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

    String[] strs = sc.nextLine().split("");

    for (int i = nums[0] -1; i <= nums[1] -1; i++) {
      changeUpperCase(strs, i);
    }

    System.out.println(String.join("", strs));

    sc.close();
  }

  static void changeUpperCase(String[] strs, int index) {
    strs[index] = strs[index].toUpperCase();
  }
}
