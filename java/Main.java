import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] nums = Arrays.stream(sc.nextLine()
                      .split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

    String[] strs = sc.nextLine().split("");

    List<String> result = new ArrayList<>();
    for (int i = nums[0] -1; i <= nums[1] -1; i++) {
      result.add(strs[i]);
    }

    System.out.println(result.stream().collect(Collectors.joining("")));

    sc.close();
  }
}
